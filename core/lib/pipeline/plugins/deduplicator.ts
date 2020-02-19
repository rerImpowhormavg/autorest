/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

import { DataHandle, DataSink, DataSource, QuickDataSource } from '@azure-tools/datastore';
import { Deduplicator } from '@azure-tools/deduplication';
import { ConfigurationView } from '../../configuration';
import { PipelinePlugin } from '../common';
import { values } from '@azure-tools/linq';
import { Channel } from '../../message';

async function deduplicate(config: ConfigurationView, input: DataSource, sink: DataSink) {
  const inputs = await Promise.all((await input.Enum()).map(async x => input.ReadStrict(x)));
  const result: Array<DataHandle> = [];

  const idm = !!config['deduplicate-inline-models'];

  for (const each of values(inputs).where(input => input.artifactType !== 'profile-filter-log')) {
    const model = <any>await each.ReadObject();

    /* 
    Disabling for now -- not sure if we need to skip this in the simple case anyway.
    if ([...values(model?.info?.['x-ms-metadata']?.apiVersions).distinct()].length < 2) {
      config.Message({ Channel: Channel.Verbose, Text: `Skipping Deduplication on single-api-version file ${each.identity}` });
      result.push(await sink.WriteObject('oai3.model-deduplicated.json', model, each.identity, 'openapi-document-deduplicated', []));
      continue;
    }
    config.Message({ Channel: Channel.Verbose, Text: `Processing deduplication on file ${each.identity}` });
    */

    const deduplicator = new Deduplicator(model, idm);
    result.push(await sink.WriteObject('oai3.model-deduplicated.json', await deduplicator.getOutput(), each.identity, 'openapi-document-deduplicated', [/* fix-me: Construct source map from the mappings returned by the deduplicator.s*/]));
  }

  return new QuickDataSource(result, input.pipeState);
}

/* @internal */
export function createDeduplicatorPlugin(): PipelinePlugin {
  return deduplicate;
}

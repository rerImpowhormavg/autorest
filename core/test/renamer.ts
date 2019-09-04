import * as aio from '@azure-tools/async-io';
import * as datastore from '@azure-tools/datastore';
import * as assert from 'assert';
import { suite, test } from 'mocha-typescript';
import { ComponentKeyRenamer } from '../lib/pipeline/plugins/component-key-renamer';

const resources = `${__dirname}../../../test/resources/renamer`;

@suite class ComponentRenaming {

  @test async 'Replace component keys for actual names.'() {

    const inputUri = 'mem://input.json';
    const outputUri = 'mem://output.json';

    const input = await aio.readFile(`${resources}/input.json`);
    const output = await aio.readFile(`${resources}/output.json`);

    const map = new Map<string, string>([[inputUri, input], [outputUri, output]]);
    const mfs = new datastore.MemoryFileSystem(map);

    const cts: datastore.CancellationTokenSource = { cancel() {/* unused */ }, dispose() {/* unused */ }, token: { isCancellationRequested: false, onCancellationRequested: <any>null } };
    const ds = new datastore.DataStore(cts.token);
    const scope = ds.GetReadThroughScope(mfs);
    const inputDataHandle = await scope.Read(inputUri);
    const outputDataHandle = await scope.Read(outputUri);

    assert(inputDataHandle != null);
    assert(outputDataHandle != null);

    if (inputDataHandle && outputDataHandle) {
      // if (inputDataHandle) {
      const outputObject = await outputDataHandle.ReadObject();
      const renamer = new ComponentKeyRenamer(inputDataHandle);

      assert.deepEqual(renamer.getOutput(), outputObject, 'Should be the same');
    }
  }
}

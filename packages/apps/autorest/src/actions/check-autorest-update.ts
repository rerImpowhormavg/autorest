import { Package } from "@azure-tools/extension";
import { gt } from "semver";
import { AutorestArgs } from "../args";
import { extensionManager, networkEnabled, pkgVersion } from "../autorest-as-a-service";
import { color } from "../coloring";

/**
 * Check if there is any updates to the autorest package and display message to use if there is.
 * @param args Autorest cli args.
 */
export const checkForAutoRestUpdate = async (args: AutorestArgs) => {
  if ((await networkEnabled) && !args["skip-upgrade-check"]) {
    try {
      const npmTag = args.preview ? "preview" : "latest";
      const newVersion = await isAutorestUpdateAvailable(npmTag);
      if (newVersion) {
        console.log(
          color(
            `\n## There is a new version of AutoRest available (${newVersion.version}).\n > You can install the newer version with with \`npm install -g autorest@${npmTag}\`\n`,
          ),
        );
      }
    } catch (e) {
      // no message then.
    }
  }
};

const isAutorestUpdateAvailable = async (npmTag: string): Promise<Package | undefined> => {
  const pkg = await (await extensionManager).findPackage("autorest", npmTag);
  return gt(pkg.version, pkgVersion) ? pkg : undefined;
};

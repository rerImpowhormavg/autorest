// polyfills for language support 
require("./lib/polyfill.min.js")

import { DocumentPatterns } from './lib/core/lib/document-type';

// exports the public AutoRest definitions
export { Installer } from "./installer";
export { IEvent } from './lib/core/lib/events';
export { IFileSystem, Message } from './lib/core';
export { Asset, Release, Github } from './github'

// the local class definition of the AutoRest Interface and the EventEmitter signatures
import { AutoRest as IAutoRest, Channel as IChannel } from './lib/core';
import { EventEmitter as IEventEmitter } from './lib/core/lib/events';

// export the selected implementation of the AutoRest interface.
import { Installer } from "./installer"

let modulePath = /(\\||\/)src(\\||\/)autorest(\\||\/)/.test(__dirname) ? `${__dirname}/../autorest-core` : Installer.AutorestImplementationPath
let impl = require(modulePath);

export const AutoRest: typeof IAutoRest = <typeof IAutoRest><any>impl.AutoRest
export declare type AutoRest = IAutoRest;

export const Channel: typeof IChannel = <typeof IChannel><any>impl.Channel
export declare type Channel = IChannel;

let event_impl = require(modulePath + "/lib/events");
export const EventEmitter: typeof IEventEmitter = <typeof IEventEmitter><any>event_impl.EventEmitter
export declare type EventEmitter = IEventEmitter;

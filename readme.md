# Awesome J2ME[![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

[<img src="j2me-logo.jpg" align="right" width="100">](https://www.oracle.com/java/technologies/javameoverview.html)

> An awesome list about Java platform Micro edition[(J2ME)](https://en.wikipedia.org/wiki/Java_Platform,_Micro_Edition), a Java specification designed for old keypad phones and PDAs. MIDP is used to create Midlets, which have `.jad` or `.jar` extension, and run on platforms like old keypad phones or PDAs.


---

## Contents

- [Emulators](#emulators)
- [Development](#development)
    - [SDKs](#sdks)
    - [IDEs](#ides)
    - [API Docs](#api-docs)
- [Reverse Engineering](#reverse-engineering)
    - [Decompilers](#decompilers)
- [Native Software](#native-software)
    - [Apps](#apps)
    - [Video Games](#video-games)
- [Related Projects](#related-projects)
- [Tutorials](#tutorials)
- [Communities](#communities)

---

## Emulators

- [J2ME Loader](https://github.com/nikita36078/J2ME-Loader) - J2ME emulator for Android.

- [JL Mod](https://github.com/woesss/JL-Mod) - Fork of J2ME loader with Mascot capsule v3 support.

- [JS2 J2ME](https://github.com/szatkus/js2me) - J2ME emulator for Firefox OS.

- [PSPKvm](https://sourceforge.net/projects/pspkvm/) - J2ME emulator for PSP.

- [FreeJ2ME](https://github.com/hex007/freej2me) - J2ME emulator with LibRetro, AWT and SDL2 frontends.

- [J2ME Emu Software](https://archive.org/details/j2me-emuSoftware) - Executables, source code of various J2ME emulators.

---

## Development

- [NN JSON](https://github.com/shinovon/NNJSON) - JSON parser for CLDC 1.1.

- [NN JSON CLDC 1.0](https://github.com/gtrxAC/discord-j2me/tree/main/src/cc/nnproject/json) - Modified version of NN JSON for CLDC 1.0.
  
### SDKs

- [Sony Ericsson](https://archive.org/details/semc_java_me_cldc_sdk.2-5-0-6) - Supports various Sony Ericsson devices. Can run Mascot capsule software too.
  
- [Sun Java Me SDK](https://www.oracle.com/java/technologies/javame-sdk/java-me-sdk-v30.html)  [mirror](https://archive.org/details/sun_java_me_sdk-3_0-win) - Successor to WTK that integrates CLDC, CDC and Blu-ray Disc Java technologies into one.

- [Sun WTK](https://www.oracle.com/java/technologies/java-archive-downloads-javame-downloads.html#sun_java_wireless_toolkit-2.5.2_01) - Official J2ME SDK by Sun.

- [MBooster](https://web.archive.org/web/20070314004015/http://innaworks.com/mBooster.html) - Optimizing suite for .jar files. Compresses images, audio, zip files and optimizes API calls.

- [Micro Code](https://web.archive.org/web/20061225061546/http://j2me-device-db.sourceforge.net/pmwiki/index.php?n=Main.HomePage) - Cross device development framework for J2ME. Supports more than 300 devices.

- [Soap ME](https://dl.acm.org/doi/abs/10.1145/1462802.1462805) - SOAP compliant Web service container that supports dynamic development.

- [J2ME Polish](https://github.com/Enough-Software/j2mepolish) - Open source, Ant based build tool for J2ME that supports building for multiple platforms including Blackberry, Symbian.

- [Extra Transit Mobile Interaction Suite](http://web.archive.org/web/20070210202710/http://www.extransit.com) - IDE and SDK for J2ME specializing in development of internet based applications. 

### IDEs

- [NetBeans 6.1](https://archive.org/download/netbeans-olds/6.1) - Mobility-pack, normal NetBeans and Java-ME SDK, all of them are required to setup MIDP development environment.

- [Eclipse](https://archive.eclipse.org/eclipse/downloads) - Archive of all versions of Eclipse IDE.

### API Docs

- [J2ME Docs](https://nikita36078.github.io/J2ME_Docs) - Documentation for J2ME and some vendor specific APIs.

---

## Reverse Engineering

- [PyLng](https://github.com/CakesTwix/pylng) - HandyGames .lng file parser written in Python.


### Decompilers

Any decompiler that works for Java will work for J2ME too.

- [Jd Decompiler](https://java-decompiler.github.io) - Java decompiler with support for Java 5 and later.  

- [Fernflower](https://github.com/fesh0r/fernflower) - Analytical Java decompiler by Jet Brains.

- [Javadecompilers.com](https://www.javadecompilers.com) - Online Java decompiler that supports various decompilers.

- [Vineflower](https://github.com/vineflower/vineflower) - Fork of Fernflower decompiler with improved output quality.

  
## Native Software

### Apps

- [Jtube](https://github.com/shinovon/JTube) - YouTube client based on Invidious API.

- [Telegram Micro](https://github.com/faissaloo/telegram-micro) - Telegram client.

- [MeBoy](http://arktos.se/meboy) - Supports emulating GBC with sound, color and save states.

- [Hotpants](https://github.com/baumschubser/hotpants/) - HOTP/TOTP client.

- [Discord J2ME](https://github.com/gtrxAC/discord-j2me) - Unofficial Discord client for J2ME. Utilizes proxy server for HTTP, gateway connections.

### Video Games

- [Kahvibreak](https://bluemaxima.org/kahvibreak) - Collection of J2ME games.

- [Moby Games](https://www.mobygames.com/platform/j2me) - Database of J2ME games with links to official stores.

- [The "New" J2ME software archive](https://archive.org/details/96x65pixels_j2me) - 74GB+, sorted collection of J2ME games.

  
---

## Related Projects

- [J2ME Preservation](https://github.com/j2me-preservation/j2me-preservation) - Archive of various J2ME software.

- [J2ME Fandom](https://j2me.fandom.com/wiki) - Wiki of everything related to J2ME.

---

## Tutorials

- [A Testing Method for Java ME Software](https://doi.org/10.1109/EmbeddedCom-ScalCom.2009.21) - Reviews various unit testing methods for J2ME and introduces a custom one for NetBeans.

- [Security Evaluation of J2ME CLDC Embedded Java Platform](http://codexx.s3.amazonaws.com/hack-ohm/j2me_cldc_security_evaluation.pdf) - Paper on J2ME security and vulnerability analysis.
- [Automated GUI Testing for J2ME Software Based on FSM](https://ieeexplore.ieee.org/abstract/document/5341641) - Introduces a technique for automating tests of LCDUI J2ME applications based on FSM.

- [Experiences of Implementing BitTorrent on Java ME Platform](https://ieeexplore.ieee.org/abstract/document/4446557) - Detailed writeup on implementing BitTorrent client on Nokia S40. Includes metrics and relevant works.
- [Distributed Gaming using J2ME and XML](https://www.cs.sjsu.edu/faculty/pollett/masters/Semesters/Fall03/Rekha/CS297Report.pdf) - Writeup on creating a cross-platform using Oracle XML database, IBM WebSphere VM.


---

## Communities
 
- [Kahvibreak Discord](https://discord.gg/8TgbHAG) - Discord community focused on preserving J2ME games.

- [r/J2MEGaming](https://reddit.com/r/j2megaming) - Reddit community for J2ME, Symbian and related platforms.

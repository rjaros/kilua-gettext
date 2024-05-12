# Kilua Gettext

This is a fork of the library implementing the main part of the [kotlinx-gettext](https://github.com/kropp/kotlinx-gettext) project. 
The library has been modified to work with Kotlin/JS and Kotlin/WasmJs targets in the browser environment. The original project 
is tightly coupled with Okio library, providing no real support for the browsers.

The main goal of this fork is to provide a simple and efficient way to use Gettext translations in Kotlin/JS and Kotlin/WasmJs web applications.
Specifically, this library is used internally by the [Kilua web framework](https://github.com/rjaros/kilua).

[![Maven Central](https://img.shields.io/maven-central/v/dev.kilua/kilua-gettext.svg?label=Maven%20Central)](https://central.sonatype.com/search?namespace=dev.kilua&name=kilua-gettext)
![license](https://img.shields.io/github/license/kropp/kotlinx-gettext)

## Usage

### Library

Add the `"dev.kilua:kilua-gettext:${version}"` to the dependencies of your project.
The library is available on [Maven Central](https://search.maven.org/artifact/dev.kilua/kilua-gettext).

Load translated strings and apply translations using an instance of `I18n` class.

```kotlin
@JsModule("./de.po")
external object dePo : JsAny

val i18n = Gettext.load(Locale("de"), dePo.toString())
println(i18n.tr("Hello world!"))
```

Refer to [GNU gettext documentation](https://www.gnu.org/software/gettext/) for more details.

### Translation

You can use [Gradle plugin from the original project](https://github.com/kropp/kotlinx-gettext#translation) to extract strings from Kotlin code and setup `gettext` task.

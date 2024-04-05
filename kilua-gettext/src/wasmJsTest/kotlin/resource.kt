/*
 * Copyright 2022 Victor Kropp
 * Copyright 2024 Robert Jaros
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package name.kropp.kotlinx.gettext

@JsModule("./de.po")
external val dePo: String

@JsModule("./empty.po")
external val emptyPo: String

@JsModule("./empty-plural.po")
external val emptyPluralPo: String

@JsModule("./en.po")
external val enPo: String

@JsModule("./format.po")
external val formatPo: String

@JsModule("./plural.po")
external val pluralPo: String

@JsModule("./quoted.po")
external val quotedPo: String

@JsModule("./ru.po")
external val ruPo: String

@JsModule("./some-plural.po")
external val somePluralPo: String

@JsModule("./whitespace.po")
external val whitespacePo: String

actual fun resource(name: String): String {
    when (name) {
        "de.po" -> return dePo
        "empty.po" -> return emptyPo
        "empty-plural.po" -> return emptyPluralPo
        "en.po" -> return enPo
        "format.po" -> return formatPo
        "plural.po" -> return pluralPo
        "quoted.po" -> return quotedPo
        "ru.po" -> return ruPo
        "some-plural.po" -> return somePluralPo
        "whitespace.po" -> return whitespacePo
        else -> error("Unknown resource $name")
    }
}

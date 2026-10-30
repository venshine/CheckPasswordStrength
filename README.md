CheckPasswordStrength
==

English | [简体中文](README-CN.md)

[![JitPack](https://jitpack.io/v/venshine/CheckPasswordStrength.svg)](https://jitpack.io/#venshine/CheckPasswordStrength)  [![CI](https://github.com/venshine/CheckPasswordStrength/actions/workflows/ci.yml/badge.svg)](https://github.com/venshine/CheckPasswordStrength/actions/workflows/ci.yml)

CheckPasswordStrength is an open-source Java library for checking password strength.

Desc
--
#### Dictionary
**{"password", "abc123", "iloveyou", "adobe123", "123123", "sunshine","1314520", "a1b2c3", "123qwe", "aaa111", "qweasd", "admin", "passwd"}**

#### Level
* **0-3 : [easy]**
* **4-6 : [medium]**  
* **7-9 : [strong]**  
* **10-12 : [very strong]**  
* **&gt;12 : [extremely strong]**  

Usage
--
Pure Java with no third-party dependencies. It can be called directly from both Java and Kotlin (JVM / Android).

##### Java:
```Java
    public static void main(String[] args) {
		String passwd = "2hAj5#mne-ix.86H";
		System.out.println(CheckStrength.checkPasswordStrength(passwd));
	}
```

```Java
    CheckStrength.LEVEL level = CheckStrength.getPasswordLevel(passwd); // EASY / MEDIUM / STRONG / VERY_STRONG / EXTREMELY_STRONG
```

##### Kotlin:
```kotlin
import com.wx.pwd.CheckStrength

fun main() {
    val passwd = "2hAj5#mne-ix.86H"
    println(CheckStrength.checkPasswordStrength(passwd)) // strength score

    when (CheckStrength.getPasswordLevel(passwd)) {
        CheckStrength.LEVEL.EASY, CheckStrength.LEVEL.MEDIUM -> println("Password is too weak")
        else -> println("Password is strong enough")
    }
}
```

Download
--
##### Gradle (via JitPack):
```groovy
repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.venshine:CheckPasswordStrength:2.0.0'
}
```

##### Gradle Kotlin DSL:
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.venshine:CheckPasswordStrength:2.0.0")
}
```

##### Jar:
[Download the jar](https://github.com/venshine/CheckPasswordStrength/blob/master/CheckPasswordStrength.jar)

> 2.0.0 fixes consecutive sequence detection, dictionary word detection and a crash on very long numeric passwords, so some passwords score differently than in 1.x. The enum `LEVEL.MIDIUM` has been renamed to `LEVEL.MEDIUM`. See the [CHANGELOG](CHANGELOG.md).

Test
--
```shell
./test.sh
```

About
--
* Email: venshine.cn@gmail.com

License
--
    Copyright (C) 2014 venshine.cn@gmail.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

CheckPasswordStrength
==
CheckPasswordStrength是一个Java开源库，提供检测密码强度的功能。

Desc
--
#####Dictionary:
{"password", "abc123", "iloveyou", "adobe123", "123123", "sunshine","1314520", "a1b2c3", "123qwe", "aaa111", "qweasd", "admin", "passwd"}

#####Level:
0-3:easy;

4-6:midium;

7-9:strong;

10-12:very strong;

&gt;12:extremely strong.


Usage
--
```Java
    public static void main(String[] args) {
		String passwd = "2hAj5#mne-ix.86H";
		System.out.println(CheckStrength.checkPasswordStrength(passwd));
	}
```

Download
--
[下载jar包](https://github.com/venshine/CheckPasswordStrength/blob/master/CheckPasswordStrength.jar)

About
--
* Email：venshine.cn@gmail.com

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


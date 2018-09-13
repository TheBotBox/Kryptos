# Kryptos
Simple Java API for encryption/decryption on Android.

![alt_tag](https://user-images.githubusercontent.com/41512314/45507833-c9a59800-b7b0-11e8-87f2-c99c288f9e86.png)

#  Contents 
**[Features](#features)**  
**[Implementation](#implementation)**   
**[API Usage](#api-usage)**  
**[Get It On Play Store](#get-it-on-play-store)**    
**[To-dos](#to-dos)**    
**[License](#license)**  

# Features  
**a).** Encrypt/decrypt text based on user entered 4 character secret key.  
**b).** 16 character secret key encryptiom/decryption.

# Implementation 
Library is available on JCenter, simply add the following line in your app `build.gradle` 
```
implementation'the.bot.box:kryptos:{latest-version}'
```  
where `{latest-version}` corresponds to latest published version <a href='https://bintray.com/boxbotbarry/maven/kryptos/_latestVersion'><img src='https://api.bintray.com/packages/boxbotbarry/maven/kryptos/images/download.svg'></a>  

# API Usage  
__4 character Secret Key__  

To encrypt text based on user entered 4 character secret key,  
```
String cipher = Kryptos.CIPHER_4("textToCipher","1578");
```
To decrypt the same cipher text,
```
String decipher = Kryptos.DECIPHER_4("textToDeCipher", "1578");
```


# Get It On Play Store  

# To-Dos   

#   License  
![alt tag](https://img.shields.io/github/license/mashape/apistatus.svg)  
```
Copyright (c) 2018 TheBotBox

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
documentation files (the "Software"), to deal in the Software without restriction, including without
limitation the rights to use, copy, 
modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to 
whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions 
of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
CONTRACT, TORT OR OTHERWISE,ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
IN THE SOFTWARE.
```





# Selenide-tests-for-Google-and-imdb
Getting 5 persons born today from imdb site


## Tools used

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/intellij.png" heigth="64px">
  </p>
</div>

IntelliJ IDEA for code writing from JetBrains
https://www.jetbrains.com/idea/

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/java.png" heigth="64px">
  </p>
</div>

Java programming language from Oracle
https://www.java.com/en/

Check JAVA version

```
java -version
```

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/selenide.png" heigth="64px">
  </p>
</div>

Selenide framework with Selenium web driver
https://selenide.org/

Dependency

```
<!-- Selenide -->
        <dependency>
            <groupId>com.codeborne</groupId>
            <artifactId>selenide</artifactId>
            <version>6.6.4</version>
            <scope>test</scope>
        </dependency>
```

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/testng.png" heigth="64px">
  </p>
</div>

TestNG testing framework
https://testng.org/

Dependency

```
<!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.5</version>
            <scope>test</scope>
        </dependency>
```

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/slf4j.png" heigth="64px">
  </p>
</div>

SLF4J - Simple Logging Fascade 4 Java
https://www.slf4j.org/

Dependency

```
<!-- SLF4J -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-simple</artifactId>
            <version>1.7.36</version>
        </dependency>
```

<div>
  <p>
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/allure.png" heigth="64px">
  </p>
</div>

Allure Report for automation testing
https://allurereport.org/

Scoop packet manager
https://scoop.sh/

To install scoop in Windows Powershell 'Run as Administrator'

```
iwr -useb get.scoop.sh | iex
```

Windows may prevent installing scripts. To overcome that you may need to change settings

```
Set-ExecutionPolicy RemoteSigned -scope CurrentUser
```

If that won't work following code will

```
iex "& {$(irm get.scoop.sh)} -RunAsAdmin"
```

Check for scoop version in Powershell

```
scoop -v
```

To install Allure

```
scoop install allure
```

Check Allure version

```
allure --version
```

Dependency

```
<!-- Allure TestNG Adapter -->
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-testng</artifactId>
            <version>2.20.1</version>
        </dependency>
```

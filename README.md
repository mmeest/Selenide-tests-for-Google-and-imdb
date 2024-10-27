<div>
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/imdbmest.png" height="128px">
  </p>
</div>

# Selenide-tests-for-Google-and-imdb
Getting 5 persons born today from imdb site

## Initial task

An automated test for imdb.com.
Technology/tool stack: use java, Selenide, TestNG, Allure Report

Test scenario:
1) open google.com
2) search for "imdb"
3) click on correct search result that redirects to imdb.com
4) click on Menu button
5) click on "Born Today"
6) print out 5 first celebrities who were born today

Add assertions where necessary.

## Tools used

<div>
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/intellij.png" height="64px">
  </p>
</div>

IntelliJ IDEA for code writing from JetBrains
https://www.jetbrains.com/idea/

<div>
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/java.png" height="64px">
  </p>
</div>

Java programming language from Oracle
https://www.java.com/en/

Check JAVA version

```
java -version
```

<div>
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/Maven.png" height="64px">
  </p>
</div>

Apache Maven for software management
https://maven.apache.org/

<div>
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/selenide.png" height="64px">
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
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/testng.png" height="64px">
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
  <p align="center">
    <img src="https://github.com/mmeest/Selenide-tests-for-Google-and-imdb/blob/master/img/allure.png" height="64px">
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

To generate Allure report after tests

```
mvn clean test allure:serve
```

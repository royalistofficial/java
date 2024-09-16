# Практика #4

Изучите утилиту $javadoc$ и научитесь ее пользоваться.

***

я ее установил $javadoc$:
```bash
(base) royalist@fedora:~/Desktop/java/Practice_4$ javadoc --version
javadoc 21.0.4
```

и запустил создание документации:

```bash
(base) royalist@fedora:~/Desktop/java/Practice_4$ javadoc -d doc Main.java
Loading source file Main.java...
Constructing Javadoc information...
Building index for all the packages and classes...
Standard Doclet version 21.0.4+7
Building tree for all the packages and classes...
Generating doc/Main.html...
Main.java:3: warning: no comment
public class Main {
       ^
Main.java:3: warning: use of default constructor, which does not provide a comment
public class Main {
       ^
Main.java:4: warning: no comment
    public static void main(String[] args) {
                       ^
Generating doc/package-summary.html...
Generating doc/package-tree.html...
Generating doc/overview-tree.html...
Building index for all classes...
Generating doc/allclasses-index.html...
Generating doc/allpackages-index.html...
Generating doc/index-all.html...
Generating doc/search.html...
Generating doc/index.html...
Generating doc/help-doc.html...
3 warnings
```

изучил возможные параметры данной утилиты:
```bash
(base) royalist@fedora:~/Desktop/java/Practice_4$ javadoc -d doc -author -version -private Main.java
```
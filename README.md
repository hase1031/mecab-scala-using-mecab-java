mecab-scala-using-java
======================

javaのライブラリを使っています

How to Use
==========

0. install [mecab](http://mecab.googlecode.com/svn/trunk/mecab/doc/index.html)

1. download [mecab-java](http://code.google.com/p/mecab/downloads/list)

2. edit Makefile (e.g. ``` INCLUDE=$(JAVA_HOME)/include ```)

3. ``` make ```

4. mv MeCab.jar & libMeCab.so to (this project)/lib/

5. sbt run
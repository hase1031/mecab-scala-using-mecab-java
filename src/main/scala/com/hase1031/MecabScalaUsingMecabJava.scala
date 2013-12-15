package com.hase1031

import org.chasen.mecab.Tagger

object MecabScalaUsingMecabJava extends App {
  System.loadLibrary("MeCab")
  val client = new Client
  client.parse("すもももももももものうち")
}

class Client {
  def parse(str: String) {
    val tagger = new Tagger("-Ochasen")
    println(tagger.parse(str))
  }
}

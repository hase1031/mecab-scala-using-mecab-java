import sbt._
import sbt.Keys._

object MecabScalaUsingMecabJavaBuild extends Build {

  lazy val mecabScalaUsingMecabJava = Project(
    id = "mecab-scala-using-mecab-java",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Mecab Scala Using Mecab Java",
      organization := "com.hase1031",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
//      libraryDependencies += "org.chasen.mecab" % "mecab-java" % "0.993"
    )
  )
}

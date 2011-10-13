organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

// additional libraries
libraryDependencies ++= Seq(
	"org.specs2" %% "specs2" % "1.6.1" % "test", // For specs.org tests
	"org.scalatest" %% "scalatest" % "1.6.1", // scalatest
	"junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
	"ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default", // Logging
  	"org.scala-tools.testing" %% "scalacheck" % "1.9" % "test"
)
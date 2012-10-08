organization := "com.example"

name := "basic.g8"

version := "1.0"

scalaVersion := "2.9.2"

// additional libraries
libraryDependencies ++= Seq(
	"org.specs2" %% "specs2" % "1.12.1" % "test", // For specs.org tests
	"org.scalatest" %% "scalatest" % "1.6.1", // scalatest
	"junit" % "junit" % "4.8" % "test->default", // For JUnit 4 testing
	"ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default", // Logging
  	"org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
)

resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
                    "releases"  at "http://scala-tools.org/repo-releases",
                    "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                    "releases"  at "http://oss.sonatype.org/content/repositories/releases")

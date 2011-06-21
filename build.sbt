name := "My Project"

version := "1.0"

scalaVersion := "2.9.0"

seq(WebPlugin.webSettings: _*)

libraryDependencies += "junit" % "junit" % "4.8" % "test"

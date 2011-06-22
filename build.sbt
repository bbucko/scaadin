name := "scaadin"

version := "0.01"

scalaVersion := "2.9.0-1"

seq(WebPlugin.webSettings: _*)

resolvers ++= Seq(
    "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
    "Scala-Tools Snapshots" at "http://scala-tools.org/repo-snapshots"
)

libraryDependencies ++= {
    val scalatraVersion = "2.0.0-SNAPSHOT"
    val vaadinVersion = "6.6.2"
    val liftwebVersion = "2.4-SNAPSHOT"
    Seq(
        "com.vaadin" % "vaadin" % vaadinVersion,
        "org.scalatra" %% "scalatra" % scalatraVersion,
        "net.liftweb" %% "lift-json" % liftwebVersion,
        "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
        "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
        "junit" % "junit" % "4.5" % "test->default"
    )
}
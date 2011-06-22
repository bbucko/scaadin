name := "scaadin"

version := "0.01"

scalaVersion := "2.9.0-1"

seq(WebPlugin.webSettings: _*)

jettyScanDirs := Nil

resolvers ++= Seq(
    "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
    "Scala-Tools Snapshots" at "http://scala-tools.org/repo-snapshots"
)

libraryDependencies ++= {
    val scalatraVersion = "2.0.0-SNAPSHOT"
    val vaadinVersion = "6.6.2"
    val liftwebVersion = "2.4-SNAPSHOT"
    val cashbahVersion = "2.1.5.0"
    Seq(
        "org.scalatra" %% "scalatra" % scalatraVersion withSources(),
        "net.liftweb" %% "lift-json" % liftwebVersion withSources(),
        "com.vaadin" % "vaadin" % vaadinVersion withSources(),
        "com.mongodb.casbah" %% "casbah-core" % cashbahVersion withSources(),
        "com.mongodb.casbah" %% "casbah-commons" % cashbahVersion withSources(),
        "com.mongodb.casbah" %% "casbah-query" % cashbahVersion withSources(),
        "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "jetty",
        "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
        "junit" % "junit" % "4.5" % "test->default"
    )
}
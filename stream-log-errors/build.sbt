import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "stream-log-errors",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.9",
      "com.typesafe.akka" %% "akka-protobuf" % "2.5.9",
      "com.typesafe.akka" %% "akka-stream" % "2.5-SNAPSHOT",
      scalaTest % Test
    )
  )

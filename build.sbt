val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "example",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "io.d11" %% "zhttp" % "1.0.0.0-RC19",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

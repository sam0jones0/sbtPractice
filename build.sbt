ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "com.example"
ThisBuild / version := "0.1"

lazy val hello = (project in file("."))
  .settings(
    name := "hello",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  )

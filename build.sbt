lazy val commonSettings = Seq(
  organization := "org.typelevel",
  version := "0.1.0",
  resolvers += "scalatl" at "http://milessabin.com/scalatl",
  //scalaVersion := "2.11.8" // compile will fail
  scalaVersion := "2.11.8-tl-201604190743", // compile succeeds
  scalaBinaryVersion := "2.11"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "si2712fix-demo",
    scalacOptions ++= Seq(
      "-feature",
      "-language:higherKinds",
      "-Yhigher-order-unification"
    )
  )

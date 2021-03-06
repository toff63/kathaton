import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "kathaton"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "se.radley" % "play-plugins-salat_2.10" % "1.2")

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Typesafe Repository 2" at "http://repo.typesafe.com/typesafe/repo/"
  )

}

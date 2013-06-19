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
    "com.novus" %% "salat" % "1.9.2-SNAPSHOT")

  val main = play.Project(appName, appVersion, appDependencies).settings(
    routesImport += "se.radley.plugin.salat.Binders._",
    templatesImport += "org.bson.types.ObjectId",
    resolvers += Resolver.sonatypeRepo("snapshots"))

}

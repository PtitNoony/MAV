import java.io.{FileInputStream, InputStreamReader, File}
import java.util.Properties
import scala.collection.JavaConversions._
import sbt._
import sbt.Keys._

object MASModelBuild extends Build {
	def createProject(id:String): Project = Project(id, file(id))
}
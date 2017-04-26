import sbt._

object MASVisualizationBuild extends Build {

	def createRootProject(id: String):Project = Project(id,file("."))
	
	def createProject(id:String, folder: String): Project = Project(id, file(folder))
}
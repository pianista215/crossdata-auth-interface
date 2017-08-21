package com.stratio.crossdata.security

case class Resource(instances: Seq[String], resourceType: ResourceType, name: String)

sealed trait ResourceType{
  def name(): String
}

case object DatabaseResource extends ResourceType{
  override def name(): String = "database"
}

case object TableResource extends ResourceType{
  override def name(): String = "table"
}

case object DatastoreResource extends ResourceType{
  override def name(): String = "datastore"
}

object Resource {
  val CrossdataClusterNameEnvVar = "CROSSDATA_CLUSTER_NAME"
  val AllResourceName = "*"
}
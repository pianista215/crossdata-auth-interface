/*
 * © 2017 Stratio Big Data Inc., Sucursal en España. All rights reserved.
 *
 * This software – including all its source code – contains proprietary information of Stratio Big Data Inc., Sucursal en España and may not be revealed, sold, transferred, modified, distributed or otherwise made available, licensed or sublicensed to third parties; nor reverse engineered, disassembled or decompiled, without express written authorization from Stratio Big Data Inc., Sucursal en España.
 */
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
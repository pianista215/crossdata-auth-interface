package com.stratio.crossdata.security

trait CrossdataSecurityManager {

  def start() : Unit

  def stop(): Unit

  def authorize(userId: String, resource: Resource, action: Action): Boolean

  def audit(auditEvent: AuditEvent): Unit

}
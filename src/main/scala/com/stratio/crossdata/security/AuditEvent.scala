package com.stratio.crossdata.security


case class AuditEvent(userId: String, resource: Resource, action: Action, result: AuditResult, impersonation: Option[Boolean] = None)
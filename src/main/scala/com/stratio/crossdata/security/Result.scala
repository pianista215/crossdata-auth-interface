package com.stratio.crossdata.security

sealed trait AuditResult

// TODO (version 1.8 or higher) rename successAR to Success
case object SuccessAR extends AuditResult

case object FailAR extends AuditResult
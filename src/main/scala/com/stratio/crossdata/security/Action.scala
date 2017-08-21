package com.stratio.crossdata.security

/**
  * WARNING: Update crossdata plugin when modifying the actions
  */
sealed trait Action

case object Read extends Action

case object Write extends Action

case object Create extends Action

case object Drop extends Action

case object Cache extends Action
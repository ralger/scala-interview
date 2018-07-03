import sbt._
import Keys._

object Dependencies {

  val sparkVersion = "2.0.2"


  val commonDependencies = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4",
    "org.slf4j" % "slf4j-log4j12" % "1.7.10"
  )

  val testingDependancies = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4"
  )

  val sparkDependencies = commonDependencies ++ Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-hive" % sparkVersion
  )

  val akkaDependencies = commonDependencies ++ Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.4.12",
    "com.typesafe.akka" %% "akka-http-core" % "2.4.11",
    "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
    "com.typesafe.akka" %% "akka-http-testkit" % "2.4.11",
    "com.typesafe.akka" %% "akka-http-xml-experimental" % "2.4.11"
  )

  val sparkDependenciesCassandra = sparkDependencies ++ Seq(
    "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3"
  )


  val sparkDependenciesXML = sparkDependencies ++ Seq(
    "com.databricks" %% "spark-xml" % "0.4.1"
  )

  val config = Seq(
    "com.typesafe" % "config" % "1.3.0"
  )

}

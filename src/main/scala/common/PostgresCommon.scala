package common


import org.apache.spark.sql.{DataFrame, SparkSession}

import java.util.Properties

object PostgresCommon {
  def getPostgresCommonProps(): Properties = {

    println("Postgress Properties Started ")

    val pgConnectionProperties = new Properties()
    pgConnectionProperties.put("user", "postgres")
    pgConnectionProperties.put("password", "baqisa")

    pgConnectionProperties
  }

  def getPostgresServerDatabase(): String = {
    val pgUrl="jdbc:postgresql://localhost:5432/postgres"
    pgUrl

  }

  def fetchDataFrameFromPgTable(spark:SparkSession,pgTable: String): DataFrame = {
    val pgCourseDataframe=spark.read.jdbc(getPostgresServerDatabase,pgTable,getPostgresCommonProps)
    pgCourseDataframe
  }

}

import common.{PostgresCommon, SparkCommon}
import org.apache.spark.sql.SparkSession
import org.slf4j.LoggerFactory

import java.util.Properties

object TransformationSteps {

  // private val logger = LoggerFactory.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {
    try{
      val spark: SparkSession = SparkCommon.createSparkSession()
      // Hive table creation
      // SparkCommon.createFutureXCourseHiveTable(spark)

      // val CourseDF = SparkCommon.readFutureXCourseHiveTable(spark).get
      // CourseDF.show()

      val cdf=SparkCommon.readData(spark)
      cdf.show()


      /*val pgTable = "web_events"
      val pgCourseDataframe = PostgresCommon.fetchDataFrameFromPgTable(spark: SparkSession, pgTable)
      println("Fetched Datfreame ")
      pgCourseDataframe.show()*/
    } catch {
      case e: Exception =>
        println("An Error is occured")

    }


  }

}

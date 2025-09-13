import org.apache.spark.sql.SparkSession

object HelloWorld {
  def main(args: Array[String]): Unit = {
    /*println("My First Scala Progrram:")

    val spark=SparkSession
      .builder()
      .appName("Hello World Spark")
      .config("spark.master","local")
      .getOrCreate()
    println("Spark Session Created")
    val sam_seq=Seq((1,"Saprk"),(2, "Bigdata"))
    val df=spark.createDataFrame(sam_seq).toDF("Course_ID","Course_Name")
    df.show()
    df.write.format("csv").save("C:\\Users\\kpsah\\Desktop\\Spark_scala_coding_frame_work\\output\\2ndout")*/

    var pMap:Map[Char,Int]=Map('a'-> 121,'b'->334,'c'->345,'d'->456,'e'-> 678)
    println(pMap.contains('d'))

    var keys=pMap.keys
    keys.filter(n=>n=='a').foreach((n=>println(n+" "+pMap.get(n))))
    for(elem<-pMap){
      println(elem._1+" "+elem._2)
    }


  }

}

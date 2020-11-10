import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types._
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.expressions.Window
import org.apache.spark.{SparkConf, SparkContext}


object fifa {
  def main(arg: Array[String]): Unit = {
//    val sparkSession: SparkSession = SparkSession.builder.master("local").appName("fifa19").getOrCreate()
//    val fifa_data = sparkSession.read.option("inferSchema", value = true).option("header", value = true).
//      csv("data.csv")
//
//    fifa_data.printSchema()

    val conf = new SparkConf().setMaster("local").setAppName("fifa19csv")
    val sc = new SparkContext(conf)
    val sparkSession = SparkSession.builder
      .config(conf = conf)
      .appName("spark session example")
      .getOrCreate()

    val path = "data.csv"
    val base_df = sparkSession.read.option("header","true").
      csv(path)
//    base_df.printSchema()
    base_df.select("Preferred Foot").show()
//    base_df.coalesce(1).write.mode("overwrite").option("header","true").csv("hdfs://192.168.0.170:8020/MyData/fifa19.csv")
//    sparkSession.sql("show tables").show()
    //base_df.write.mode("overwrite").saveAsTable("default.fifa19Assessment")
    //sparkSession.sql("select * from fifa19Assessment").show()
  def MostNumberOfMF {
      
  }
  }
}
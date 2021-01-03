package io
import scala.io.Source

object FileReader {

    def main(args: Array[String]) = {
       val lines = Source.fromFile("src/main/resources/simple.txt").getLines().toList
       //get max len
       val maxLen = lines.reduceLeft(
         (x:String,y:String) =>  if (x.length > y.length) x else y)

       for (line <- lines) {
         val numSpaces = maxLen.length - line.length
         val padding = " " * numSpaces
         println(padding + line.length + " | " + line)
       }

    }
}

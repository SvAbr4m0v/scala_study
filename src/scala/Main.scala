package scala

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    coupleDigits(StdIn.readInt())
  }

  def coupleDigits(x : Int) {
    for(i <- 1 until x; j <- 1 until x) {
      val y = BigInt(i).gcd(j)
      if (y == 1)
         println(s"$i $j")
    }
  }

  def snakeCaseChecker(word: String): Boolean = {
    if (word.startsWith("_") || word.endsWith("_"))
      return false
    val stringsToCheck = word.split("_")
    val ifSnakeCase = stringsToCheck.filter(x => {
      x.matches("[a-z]+")
    })
    ifSnakeCase.foreach(println)

    stringsToCheck.length == ifSnakeCase.length

  }

  def middle[A](data: Iterable[A]): A = {
    val size = data.size
    for (i <- 1 to 10; j <- 1 to 10) println(i + j)
    val m = data.toList(size/2)
    val searchOdd = (searchArray : List[Int])=> LessonData.searchInArray(_%2==1, searchArray) : List[Int]
    m
  }

}


object LessonData{
  def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
    array.filter(cond)
  }
}
/** solution to http://projecteuler.net/problem=1 */
object Main {
  def main(args: Array[String]) {
    val n = if (args.length < 1) 1000 else args(0).toInt
    println("calculating sum of multiples of 3, 5 for n = " + n)
    println("result: " + sumOfMultiples(n))
  }

  def sumOfMultiples(n: Int) : Int = {
    var sum = 0
    for (m <- 1 to (n - 1)) 
      if (m % 3 == 0 || m % 5 == 0) sum = sum + m
    return sum;
  }
}
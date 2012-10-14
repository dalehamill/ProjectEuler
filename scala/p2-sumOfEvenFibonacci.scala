/** solution to http://projecteuler.net/problem=2 */
object Main {
  def main(args: Array[String]) {
    val n = if (args.length < 1) 4000000 else args(0).toInt
    println("calculating sum of even fibonacci numbers below n = " + n)
    println("result: " + getSumOfEvenFibonacciBelowMax(1, 1, n))
  }

  def getSumOfEvenFibonacciBelowMax(a: Int, b: Int, max: Int) : Int = {
    val c = a+b
    if (c > max) return 0;
    val contribution = if (c%2 == 0) c else 0
    // return our contribution plus any remaining before we hit max
    contribution + getSumOfEvenFibonacciBelowMax(b, c, max);
  }
}
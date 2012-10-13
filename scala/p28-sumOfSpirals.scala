object Main {
  	def main(args: Array[String]) {
      val n = if (args.length < 1) 1001 else args(0).toInt
  		println("calculating sum of spirals for n = " + n)
  		println("result: " + sumOfSpirals(n))
	}

	def sumOfSpirals(n: Int) : Int = {
		// println("sumOfSpirals for n = " + n)

		// error case
		if (n <= 0) return 0; // default
		// base case
		if (n == 1) return 1; // sum of corners size 1 == 1.

		val topRight = n*n
		val topLeft = topRight - (n-1)
		val bottomLeft = topLeft - (n-1)
		val bottomRight = bottomLeft - (n-1)

		val sumOfCorners = topRight + topLeft + bottomLeft + bottomRight
		// println("  sumOfCorners for n = " + n + ": " + sumOfCorners)

		// return sum of corners + sum of corners of square n-1
		sumOfCorners + sumOfSpirals(n-1); 
	}
}
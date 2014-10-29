import scala.annotation.tailrec

object VrigzTest {

	def main(args: Array[String]) {
		val a = Array.range(0,10)
		println(sumToMax(a, 10))
	}

	def sumToMax(arr: Array[Int], limit: Int): Int = {
		var sum = 0
		for (i <- arr) {
			sum += i
			if (sum > limit)
			return limit
		}
		sum
	}

	def factorial(n: Int): Int = {
		if (n == 1) 
			1
		else
			n * factorial(n - 1)
	}

}
object TestThirtyFour {
	def main(args: Array[String]) {
		val num1 = Set(5,6,9,20,30,45)
		val num2 = Set(50,60,9,20,35,55)

		// find common elements between two sets
		println( "num.&(num2) : " + num1.&(num2) ) 
		println( "num1.intersect(num2) : " + num1.intersect(num2) )
	}
}
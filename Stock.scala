class Stock {

	// a private field can be seen by any Stock instance
	private[this] var price: Double = _
	def setPrice(p: Double) { price = p }
	def isHigher(that: Stock): Boolean = this.price > that.price

}

object VrigzDriver extends App {
	val s1 = new Stock
	s1.setPrice(20)

	val s2 = new Stock
	s2.setPrice(100)

	println(s1.isHigher(s2))
}
import scala.util.matching.Regex

object TestFiftySix {
	def main(args: Array[String]) {
		val pattern = "Scala".r
		val str = "Scala is Scalable and cool"

		println(pattern findFirstIn str)
	}
}
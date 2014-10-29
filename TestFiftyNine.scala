import scala.util.matching.Regex

object TestFiftyNine {
	def main(args: Array[String]) {
		val pattern = new Regex("abl[ae]\\d+")
		val str = "ablaw is ablel and cool"

		println((pattern findAllIn str).mkString(","))
	}
}
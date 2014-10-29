import scala.util.matching.Regex

object TestFiftySeven {
	def main(args: Array[String]) {
		val pattern = new Regex("(S|s)cala")
		val str = "Scala is scalable and cool"

		println((pattern findAllIn str).mkString(","))
	}
}
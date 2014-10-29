import java.io._

object TestSixtyFour {
	def main(args: Array[String]) {
		val writer = new PrintWriter(new File("test_sixty_four.txt"))

		writer.write("Hello Scala")
		writer.close()
	}
}
import scala.io.Source

object TestSixtySix {
	def main(args: Array[String]) {
		println("Following is the content read: ")

		Source.fromFile("test_sixty_four.txt").foreach {
			print
		}
	}
}

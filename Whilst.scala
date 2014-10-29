import scala.annotation.tailrec

object Whilst {
	@tailrec
	def whilst(testCondition: => Boolean)(codeBlock: => Unit) {
		if (testCondition) {
			codeBlock
			whilst(testCondition)(codeBlock)
		}
	}
}
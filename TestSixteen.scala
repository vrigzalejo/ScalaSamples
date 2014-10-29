import java.util.Date

object TestSixteen {
	def main(args: Array[String]) {
		val date = new Date
		log(date, "message1")
		log(date, "message2")
		log(date, "message3")
	}

	def log(date: Date, message: String) = {
		println(date + "----" + message)
	}
}
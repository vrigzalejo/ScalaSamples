case class VrigzPersonTwo (var name: String, var age: Int)

object VrigzPersonTwo {
	def apply() = new VrigzPersonTwo("<no name>", 0)
	def apply(name: String) = new VrigzPersonTwo(name, 0)
}

object VrigzCaseClassTest extends App {
	val a = VrigzPersonTwo()			// corresponds to apply()
	val b = VrigzPersonTwo("Pam")		// corresponds to apply(name: String)
	val c = VrigzPersonTwo("William Shatner", 82)

	println(a)
	println(b)
	println(c)

	// verify the setter methods work
	a.name = "Leonard Nimoy"
	a.age = 82
	println(a)
}

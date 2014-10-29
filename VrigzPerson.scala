case class VrigzPerson (var name: String, var age: Int)

object VrigzPerson {
	def apply() = new VrigzPerson("<no name>", 0)
	def apply(name: String) = new VrigzPerson(name, 0)
}
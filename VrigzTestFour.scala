abstract class Pet (name: String) {
	def greeting: String
}

class Dog (name: String) extends Pet(name) {
	val greeting = "Woof"
}

object VrigzTestFour extends App {
	val dog = new Dog("Fido")
	println(dog.greeting)
}
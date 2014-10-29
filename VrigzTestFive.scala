/*
abstract class Animal {
	val greeting = "Hello"
	def sayHello { println(greeting) }
	def run
}

class Dog extends Animal {
	override val greeting = "Woof"
	def run { println("Dog is running") }
}
*/

abstract class Animal {
	val greeting = { 
		println("Animal"); 
		"Hello" 
	}
}

class Dog extends Animal {
	override val greeting = { println("Dog");
	"Woof"
	}
}

object VrigzTestFive extends App {
	new Dog
}
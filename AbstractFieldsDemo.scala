/*
abstract class BaseController(db: Database) {
	def save { db.save }
	def update { db.update }
	def delete { db.delete }

	// abstract
	def connect

	// an abstract method that returns a String
	def getStatus: String

	// an abstract method that takes a parameter
	def setServerName(serverName: String)
}
*/
abstract class Pet(name: String) {
	val greeting: String
	var age: Int
	def sayHello { 
		println(greeting) 
	}
	override def toString = s"I say $greeting, and I'm $age"
}

class Dog(name: String) extends Pet(name) {
	val greeting = "Woof"
	var age = 2
}

class Cat(name: String) extends Pet(name) {
	val greeting = "Meow"
	var age = 5
}

object AbstractFieldsDemo extends App {
	val dog = new Dog("Fido")
	val cat = new Cat("Morris")

	dog.sayHello
	cat.sayHello

	println(dog)
	println(cat)

	// verify that the age can be changed
	cat.age = 10
	println(cat)
}
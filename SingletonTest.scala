class Brain private {
	override def toString = "This is the brain."
}

object Brain {
	val brain = new Brain
	def getInstance = brain
}

object SingletonTest extends App {
	// this won't compile
	// val brain = new Brain
	// this works
	val brain = Brain.getInstance
	println(brain)
}
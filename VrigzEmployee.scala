case class Address (city: String, state: String)
case class Role (role: String)

class Person (var name: String, var address: Address) {
	// no way for Employee auxiliary constructors to call this constructor
	def this (name: String) {
		this(name, null)
		address = null
	}

	override def toString = if(address == null) name
	else s"$name @ $address"
}

class VrigzEmployee(name: String, role: Role, address: Address) extends Person (name, address) {
	def this (name: String) {
		this(name, null, null)
	}

	def this (name: String, role: Role) {
		this(name, role, null)
	}

	def this (name: String, address: Address) {
		this(name, null, address)
	}
}
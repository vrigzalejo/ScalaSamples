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
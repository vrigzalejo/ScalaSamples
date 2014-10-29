package object utils {
	implicit class StringImprovements(val s: String) {
		def increment = s.map(c => (c + 1).toChar)
	}
}
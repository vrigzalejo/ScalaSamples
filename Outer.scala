class Outer {
	class Inner {
		private def f() {
			println("Vrigz") }
		class InnerMost {
		f() } // print Vrigz 
	}
	(new Inner).f() // Error: Vrigz is not accesssible

}

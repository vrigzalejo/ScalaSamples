package p {
	class Super {
		protected def f() { println("f") }
	}
	class Sub extends Super {
		f()
	}
	class Other {
		(new Super).f() // Error: f is not accesssible
	}
}

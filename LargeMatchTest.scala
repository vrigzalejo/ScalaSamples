object LargeMatchTest extends App {
	case class Person(firstName: String, lastName: String)
	case class Dog(name: String)

	println(echoWhatYouGaveMe(0))
	println(echoWhatYouGaveMe(true))
	println(echoWhatYouGaveMe("hello"))
	println(echoWhatYouGaveMe(Nil))

	println(echoWhatYouGaveMe(List(0,1,2)))
	println(echoWhatYouGaveMe(List(1,2)))
	println(echoWhatYouGaveMe(List(1,2,3)))
	println(echoWhatYouGaveMe(Vector(1,2,3)))

	println(echoWhatYouGaveMe((1,2)))
	println(echoWhatYouGaveMe((1,2,3)))

	println(echoWhatYouGaveMe(Person("Melissa", "Alexander")))
	println(echoWhatYouGaveMe(Dog("Suka")))

	println(echoWhatYouGaveMe("Hello, world"))
	println(echoWhatYouGaveMe(42))
	println(echoWhatYouGaveMe(42F))
	println(echoWhatYouGaveMe(Array(1,2,3)))
	println(echoWhatYouGaveMe(Array("coffee", "apple pie")))
	println(echoWhatYouGaveMe(Dog("Fido")))
	println(echoWhatYouGaveMe(List("apple", "banana")))
	println(echoWhatYouGaveMe(Map(1->"Al", 2->"Alexander")))
	println(echoWhatYouGaveMe("33d"))

	def echoWhatYouGaveMe(x: Any): String = x match {
		case 0 => "zero"
		case true => "true"
		case "hello" => "you said 'hello'"
		case Nil => "an empty List"

		case List(0, _, _) => "a three-element list with 0 as the first element"
		case List(1, _*) => "a list beginning with 1, having any number of elements"
		case Vector(1, _*) => "a vector starting with 1, having any number of elements"

		case (a, b) => s"got $a and $b"
		case (a, b, c) => s"got $a, $b, and $c"

		case Person(first, "Alexander") => s"found on Alexander, first name = $first"
		case Dog("Suka") => "found a dog named Suka"

		case s: String => s"you gave me this string: $s"
		case i: Int => s"thanks for the int: $i"
		case f: Float => s"thanks for the float: $f"
		case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
		case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
		case d: Dog => s"dog: ${d.name}"
		case list: List[_] => s"thanks for the List: $list"
		case m: Map[_, _] => m.toString

		case _ => "Unknown"

	}

}
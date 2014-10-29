//package com.zrigvrigz.breakandcontinue

import util.control.Breaks._

object BreakAndContinueDemo extends App {

	println("\n=== BREAK EXAMPLE ===")
	breakable {
		for (i <- 1 to 10) {
			println(i)
			if (i > 4) break // break out of the for loop
			//println(i)
		}
	}

	println("\n=== CONTINUE EXAMPLE ===")
	val searchMe = "peter piper picked a peck of pickled peppers"
	var numPs = 0
	for (i <- 0 until searchMe.length) {
		breakable {
			if (searchMe.charAt(i) != 'p') {
				break // break out of the 'breakable', continue the outside loop
			} else {
				numPs += 1
			}
		}
	}
	println("Found " + numPs + " p's in the string.")
}

fun readln(): String {
	return readLine()!! // Prior to Kotlin 1.6
//	return kotlin.io.readln() // Kotlin 1.6
}


fun main() {
	println("Introduza uma palavra, onde vai ser extraido o primeiro caracter")
	val line: String = readln() // Read a line
	val char: Char = line[0] // Gets first char of line

	println("Unicode of letter $char: ${char.code}")

	// Test if char is an uppercase letter
	// Operator && is the Logic AND
 	if (char >= 'A' && char <= 'Z') {
 		println("Letra maiuscula: $char")
// 		val lowerChar: Char = char + 32 // Adds offset 32
 		// Or, add the SPACE which has code = 32
 		// val lowerChar: Char = (char.code + ' '.code).toChar() // Adds offset 32
		// Or:
 		val lowerChar: Char = 'a' + ('A' - char) // Sum offset ('A' - char) to base of lowercase letters ('a')
		println("$char convertido para minuscula e': $lowerChar")
 	}
 	else if (char >= 'a' && char <= 'z') {
 		println("Letra minuscula: $char")
 		//val upperChar: Char = char - 32 // Subtracts offset 32
		// Or:
		val upperChar: Char = 'A' + ('a' - char) // Sum offset ('a' - char) to base of uppercase letters ('A')
 		println("$char convertido para maiuscula e': $upperChar")
 	}
 	else {
 		println("$char nao e' uma letra")
 	}
	
}






















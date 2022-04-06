

//fun Char.uppercase(): Char {
//    if (this in 'a'..'z')
//        return this - 32
//    else
//        return this
//}
// Or, simply:
fun Char.uppercase(): Char
    = if (this in 'a'..'z')
        this - 32
    else
         this

fun Char.isLetter(): Boolean = if (this in 'a'..'z' || this in 'A'..'Z') true else false

fun Char.digitToInt(): Int =
    // "this" is the passed char
    if (this in '0'..'9')
        this - '0'
    else
        throw Exception("Not a digit!")

// With forEach
fun String.uppercase1(): String {
    // "this" is the passed string
    var upper: String = ""
    this.forEach({ ch: Char ->
        if (ch in 'a'..'z')
            upper += ch - 32
        else
            upper += ch
    })
    return upper
}

// With for and indices
fun String.uppercase2(): String {
    // "this" is the passed string
    var upper: String = ""
    for (i in 0..this.length - 1) {
        val ch: Char = this[i]
        if (ch in 'a'..'z')
            upper += ch - 32
        else
            upper += ch
    }
    return upper
}

// With for
fun String.uppercase3(): String {
    // "this" is the passed string
    var upper: String = ""
    for (ch in this) {
        if (ch in 'a'..'z')
            upper += ch - 32
        else
            upper += ch
    }
    return upper
}

// With while and indices
fun String.uppercase4(): String {
    // "this" is the passed string
    var upper: String = ""
    var i = 0
    while (i <= this.length - 1) {
        val ch: Char = this[i]
        if (ch in 'a'..'z')
            upper += ch - 32
        else
            upper += ch
        ++i
    }
    return upper
}

//
// Devolve índice onde ocorre a String (a partir de 0) ou -1 se não encontrar;
//

// With forEach
fun String.indexOf1(char: Char): Int {
    // "this" is the passed string
    var index = 0
    this.forEach({ ch: Char ->
        // If current char (ch) is equal to the passed char then return the index
        if (ch == char)
            return index
        ++index
    })
    return -1
}

// With for
fun String.indexOf2(char: Char): Int {
    // "this" is the passed string
    for (index in 0 until this.length) {
        val ch = this[index]
        // If current char (ch) is equal to the passed char then return the index
        if (ch == char)
            return index
    }
    return -1
}

// With while
fun String.indexOf3(char: Char): Int {
    // "this" is the passed string
    var index = 0
    while (index < this.length) {
        val ch = this[index]
        // If current char (ch) is equal to the passed char then return the index
        if (ch == char)
            return index
        ++index
    }
    return -1
}

//
// Devolve índice onde ocorre a String (a partir de startIndex) ou -1 se não encontrar;
//
fun String.indexOf(char: Char, startIndex: Int): Int {
    // "this" is the passed string
    var index = 0
    while (index < this.length) {
        /// ADDED
        if (index >= startIndex) {
            val ch = this[index]
            // If current char (ch) is equal to the passed char then return the index
            if (ch == char)
                return index
        }
        ++index
    }
    return -1
}


fun List<Int>.average(): Double {
    var sum: Double = 0.0
    this.forEach({elem: Int ->
        sum += elem
    })
    return sum / this.size
}

/*
Exercícios sobre funções de extensão:

String.all(predicate: (Char) -> Boolean): Boolean; Retorna true se todos os caracteres satisfazem o predicado;
String.forEach(func: (Char) -> Unit); Aplica função func a cada carácter da string this;
List<Int>.forEach(func: (Int) -> Unit); Aplica função func a cada inteiro da lista this;
*/

// Retorna true se todos os caracteres satisfazem o predicado;
fun String.all(predicate: (Char) -> Boolean): Boolean {
    for (s in this) {
        if (!predicate(s))
            return false
    }
    return true
}

// Aplica função func a cada carácter da string this
fun String.forEach1(func: (Char) -> Unit) {
    for (elem in this) {
        func(elem)
    }
}

// Aplica função func a cada inteiro da lista this;
fun List<Int>.forEach1(func: (Int) -> Unit) {
    for (elem in this) {
        func(elem)
    }
}



fun readChar(question: String): Char {
    print(question)
    return readln()[0]
}

fun main() {
/*
    val ch = readChar("Letra? ")
    println("Letra em maiuscula: ${ch.uppercase()}")

    println('A'.isLetter())
    println('#'.isLetter())

    println('7'.digitToInt())
    println('#'.digitToInt())

    println("ola 123 a teste".uppercase1())
    println("ola 123 a teste".uppercase2())
    println("ola 123 a teste".uppercase3())
    println("ola 123 a teste".uppercase4())

    println("ola 123 a teste".indexOf1('a')) // 2
    println("ola 123 a teste".indexOf2('a')) // 2
    println("ola 123 a teste".indexOf3('a')) // 2

    println("ola 123 a teste".indexOf('a', 3)) // 8

    println(listOf(12, 13, 10, 13, 20, 10).average())

    // Inline function
    fun isLetter(char: Char): Boolean = if (char in 'a'..'z' || char in 'A'..'Z') true else false

    println("ola 123 a teste".all(::isLetter)) // false
    println("olaateste".all(::isLetter)) // true
*/
    "ola 123 a teste".forEach(::println) // Apply println to each char in string
    listOf<Int>(10, 20, 30).forEach(::println) // Apply println to each int in list


}

































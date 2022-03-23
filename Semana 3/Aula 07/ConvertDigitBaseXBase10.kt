

fun main() {
    println("Introduza um digito numa base (2, 10, ou 16):")
    val digit: Char = readln()[0] // Gets the first char of read string
    println("Introduza a base (2, 10, ou 16):")
    val base: Int = readln().toInt()
    var digitBase10: Int = 0

    if (base == 2 && digit in '0'..'1') {
        digitBase10 = digit - '0' // Convert digit to int
        // Or:
//        digitBase10 = digit.digitToInt()
    }
    else if (base == 10 && digit in '0'..'9') {
        digitBase10 = digit - '0' // Convert digit to int
    }
    else if (base == 16 && (digit in '0'..'9' || digit in 'A'..'F')) {
        if (digit in '0'..'9')
            digitBase10 = digit - '0' // Convert digit to int
        else // Convert Hex letter
            digitBase10 = 10 + (digit - 'A') // Convert digit to int
    }
    else {
        println("$digit nao esta na base $base")
        return
    }
    println("$digit na base $base e' igual $digitBase10 na base 10")
}
/*
OUTPUT:

Introduza um digito numa base (2, 10, ou 16):
B
Introduza a base (2, 10, ou 16):
16
B na base 16 e' igual 11 na base 10
---
Introduza um digito numa base (2, 10, ou 16):
2
Introduza a base (2, 10, ou 16):
2
2 nao esta na base 2
---
Introduza um digito numa base (2, 10, ou 16):
1
Introduza a base (2, 10, ou 16):
2
1 na base 2 e' igual 1 na base 10

 */



















fun main() {

    println("CalculatorWhen")

    val op1: Double = readDouble("Introduza o 1.) operando")

    println("Introduza o operador")
    val opr: Char = readLine()!![0]

    val op2: Double = readDouble("Introduza o 2.) operando")
    var res = 0.0

    when (opr) {
        '+' -> res = op1 + op2
        '-' -> res = op1 - op2
        '/' -> res = op1 / op2
        'x' -> res = op1 * op2
        '%' -> res = op1 % op2
        else -> println("Operador invalido")
    }

    /*
    val x: Double =  when (opr) {
        '+' -> res = op1 + op2
        '-' -> res = op1 - op2
        '/' -> res = op1 / op2
        'x' -> res = op1 * op2
        '%' -> res = op1 % op2
        else -> println("Operador invalido")
    }
    // Erro, os 5 primeiros ramos são do tipo Double e o último é do tipo Unit
     */
    val x: Unit =  when (opr) {
        '+' -> res = op1 + op2
        '-' -> res = op1 - op2
        '/' -> res = op1 / op2
        'x' -> res = op1 * op2
        '%' -> res = op1 % op2
        else -> println("Operador invalido")
    }
    println("x = $x")

    println("$op1 $opr $op2 = $res")
}

fun readDouble(question: String): Double {
    println(question)
    return readLine()!!.toDouble()
}
/*
CalculatorIf
Introduza o 1.) operando? 3
Introduza o operador
x
Introduza o 2.) operando? 2
3.0 x 2.0 = 6.0
 */

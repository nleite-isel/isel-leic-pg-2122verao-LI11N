
//fun nonIntersects(low1: Int, high1: Int, low2: Int, high2: Int) : Boolean {
//    if (high1 < low2 || high2 < low1)
//        return true
////    else // Is not needed when we have  if (...) with return ...
//    return false
//}

// Or:
//fun nonIntersects(low1: Int, high1: Int, low2: Int, high2: Int) : Boolean {
//    return if (high1 < low2 || high2 < low1) true else false // If-expression
//}

// Or:
fun nonIntersects(low1: Int, high1: Int, low2: Int, high2: Int) : Boolean =
    (high1 < low2 || high2 < low1) // We only return the condition which is evaluated true or false



fun main() {
    println("Union")
    // Read first interval values
    val low1 = readInt("Intervalo A limite inferior")
    val high1 = readInt("Intervalo A limite superior")
    // Read second interval values
    val low2 = readInt("Intervalo A limite inferior")
    val high2 = readInt("Intervalo A limite superior")
    // Note the use of var below
    var l = 0
    var h = 0 // Final limits

    if (nonIntersects(low1, high1, low2, high2)) {
        // Intervals don't intersect
        // Print interval union as required
        // Determine first interval
        if (low1 < low2) println("A+B = [$low1,$high1] + [$low2,$high2]") else println("A+B = [$low2,$high2] + [$low1,$high1]")
    } else { // Intersects
        l = if (low1 < low2) low1 // Final lower limit is low1
        else low2 // Final lower limit is low2
        h = if (high1 > high2) high1 // Final higher limit is high1
        else high2 // Final higher limit is high2

        // Print interval union as required
        println("A+B = [$l,$h]")
    }
}


/*
 *
Union
Intervalo A limite inferior? 2
Intervalo A limite superior? 5
Intervalo A limite inferior? 4
Intervalo A limite superior? 9
A+B = [2,9]
---
Union
Intervalo A limite inferior? 2
Intervalo A limite superior? 5
Intervalo A limite inferior? 6
Intervalo A limite superior? 9
A+B = [2,5] + [6,9]

*/
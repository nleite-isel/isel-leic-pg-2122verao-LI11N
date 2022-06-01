

fun infinite(str: String) {
    println(str)
    // Calls itself infinitely
    infinite(str)
}

fun func(str: String, n: Int) {
    println("$str $n")
    if (n > 0) {
        // Calls itself
        func(str, n - 1)
    }
    println("Adeus $n")
}



fun main() {
    //infinite("Ola")

    func("Ola", 5)
}
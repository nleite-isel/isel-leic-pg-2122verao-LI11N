
// Fold extension function receives an initial value and a function (func)
// The func has to parameters: an accumulator (acc) and the current element (elem) from list this
// Fold iterates each element from list this and applies the function using as initial as the first value
// of acc. Then, the next value of acc is the result return by func.
fun List<Int>.fold(initial: Int, func: (acc: Int, elem: Int) -> Int): Int {
    println("my fold extension function")
    var acc: Int = initial
    for (i in 0..this.size - 1) {
        acc = func(acc, this[i])
    }
    return acc
}


// Reduce extension function is similar to the fold function, except that it assumes zero for the
// initial value.
fun List<Int>.reduce(func: (acc: Int, elem: Int) -> Int): Int {
    println("my reduce extension function")
    var acc: Int = 0
    for (i in 0..this.size - 1) {
        acc = func(acc, this[i])
    }
    return acc
}



fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    val sum = list.fold(0, { acc: Int, elem: Int -> Int
        acc + elem
    })
    println(sum)
    ////////////////////////////////////
    // Using local lambda functions
    val func1: (Int, Int) -> Int = { acc: Int, elem: Int -> Int
        acc + elem
    }
    // In a more concise way
    val func2: (Int, Int) -> Int = { acc, elem -> acc + elem }

    val sum1 = list.fold(0, func1)
    println(sum1)

    val sum2 = list.fold(0, func2)
    println(sum2)
    ///////////////////////////////
    // Reduce test

    println("Reduce test")
    val sum3 = list.reduce({ acc: Int, elem: Int -> Int
        acc + elem
    })
    println(sum3)

}

/*
my fold extension function
15
my fold extension function
15
my fold extension function
15
Reduce test
my reduce extension function
15
 */





















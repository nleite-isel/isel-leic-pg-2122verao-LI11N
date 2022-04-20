


fun List<Int>.map(func: (Int) -> Int): List<Int> {
    println("my map extension function")
//    var list: List<Int> = emptyList<Int>()
    // Or:
    var list: List<Int> = listOf<Int>() // Immutable list

    for (i in 0..this.size - 1) {
        list += func(this[i]) // Creation of new immutable list and reassignment of var list
        // The same as:
//        list = list + func(this[i])
    }
    return list
}


fun main() {
    val list = listOf<Int>(10, 20, 30)
    val newList = list.map({elem: Int ->
        //elem // this is the return value of the lambda function (you cannot use the "return" keyword)
        // Another test
        elem + 10
    })
    println(newList)
    ////////////////////////////////////
    // lambda functions
    val func1: (Int) -> Int = { i: Int -> i } // Identity function
    val func2: (Int) -> Int = { i: Int -> i + 10 } // Returns argument + 10

    val newList1 = list.map(func1)
    println(newList1)

    val newList2 = list.map(func2)
    println(newList2)

}

/*
my map extension function
[10, 20, 30]

With "Another test" code above:
my map extension function
[20, 30, 40]
 */





















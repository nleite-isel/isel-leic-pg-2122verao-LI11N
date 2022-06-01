
// With immutable lists
fun List<Int>.shuffled1(): List<Int> {
    var list: List<Int> = copyList(this)
    // Aux list for performing swap of two elements
    var aux: List<Int> = emptyList()
    // Shuffle elements of list this 'this.size' times
    val size = list.size
    for (i in 0 until size) {
        // Empty aux
        aux = emptyList()
        // Choose a random element to swap with the 'last' element - this is a simple strategy of shuffling elements
        val index = (0..size - 1).random()
        println("random index: $index")
        // Or:
        //val index = this.indices.random()
        if (index != list.lastIndex) {
            // Since the list is immutable, we have to build a new list in order to perform a swap of elements
            // Copy left part
            for (j in 0 until index) {
                aux += list[j]
            }
            // Copy last
            aux += list.last()
            // Copy part from index + 1 .. lastIndex - 1
            for (j in index + 1 until list.lastIndex) {
                aux += list[j]
            }
            // Place element at index in the last position
            aux += list[index]
            // Now, replace list by aux
            list = copyList(aux)
        }
        println("Current shuffle: $list")
    }
    return list
}

// With mutable lists
fun MutableList<Int>.shuffled(): MutableList<Int> {
    val list = this.toMutableList()
    // Shuffle elements of list this 'this.size' times
    val size = this.size
    for (i in 0 until size) {
        // Choose a random element to swap with the 'last' element - this is a simple strategy of shuffling elements
        val index = (0..size - 1).random()
//        println("random index: $index")
        // Or:
        //val index = this.indices.random()
        if (index != list.lastIndex) {
            // Swap elements
            val aux = list[index]
            list[index] = list.last()
            list[list.lastIndex] = aux
        }
//        println("Current shuffle: $list")
    }
    return list
}



fun copyList(ints: List<Int>): List<Int> {
    var aux: List<Int> = emptyList()
    for (elem in ints)
        aux += elem
    return aux
}


fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val listShuffled = list.shuffled()
    println("Shuffled:")
    println(listShuffled)
    println("Shuffled: ${list.shuffled()}")
}






















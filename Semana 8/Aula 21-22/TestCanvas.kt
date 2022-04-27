import pt.isel.canvas.*
import java.util.*

// Tipo estruturado
data class MyCanvas(val width: Int, val heigth: Int, val color: Int)



const val BLACK = 100

fun main() {
    val canvas: MyCanvas = MyCanvas(10, 20, BLACK)
    println(canvas)

//    println(canvas.width)
//    println(canvas.heigth)
//    println(canvas.color)
    canvas.myPrint()

//    print("Begin ")
//    onStart( fx = {
//        val arena = Canvas(300, 200, CYAN)
//        print("Start ")
//    })
//    onFinish ( fx = {
//        print("Finish ")
//    })
//
////    Thread.sleep(5_000)  // wait for 1 second
//
//    print("End ")

//    onStart {
//        val arena = Canvas(300, 200, CYAN)
//        val radius = arena.height/2 - 10
//        arena.drawCircle(
//            arena.width/2, arena.height/2, radius, BLACK, 5
//        )
//    }
//    onFinish { }

}

fun MyCanvas.myPrint() {
    println("myPrint")
    println(this.width)
    println(this.heigth)
    println(this.color)
}

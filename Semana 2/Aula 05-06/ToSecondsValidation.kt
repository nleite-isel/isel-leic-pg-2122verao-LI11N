
fun main() {
	print("Horas? ")
	val hour = readln().toInt()
	if (hour in 0..23) {
	// Equivalent to:
	// if (hour >= 0 && hour <= 23) {
		print("Minutos? ")
		val min = readln().toInt()
		if (min in 0..59) {
			print("Segundos? ")
			val sec = readln().toInt()
			if (sec in 0..59) {
				val secs = hour*3600 + min*60 + sec
		
				println("$hour:$min:$sec = $secs segundos.")
			}
			else
				println("Segundos invalidos")
		}
		else
			println("Minutos invalidos")
	}
	else
		println("Horas invalidas")

}

/*
Horas? 1
Minutos? 2
Segundos? -1
Segundos invalidos
*/

/*
Horas? 1
Minutos? 2
Segundos? 7
1:2:7 = 3727 segundos.

*/

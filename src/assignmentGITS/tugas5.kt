package assignmentGITS

import java.util.*

//
//Buatlah program Getters and Setters
//yang mengimplementasikan pembulatan nilai,
//bisa menggunakan percabangan if atau yang lainnya untuk menentukan pembulatan nialinnya.
//
//
//Contoh case misal :
//Misal ada data type Double untuk mennetukan 0 atau 1,
//bisa diklasifikasikan, misal data nilai yang ada 0.6 bisa dibulatkan
//ke angka 1. Dan apabila angka kurang dari 0.5 bisa dibulatkan menjadi 0.

fun main() {

//    val number1: Double
//
//    val writeANumber = Scanner(System.`in`)
//
//    println("Masukkan berat badan = ")
//    number1 = writeANumber.nextDouble()

    val yourBB = nilaiBulat()
    val minimalBB = 59.6
    yourBB.beratBadan = 59.8
    // yourBB.actualBB = 55.8

    if (yourBB.beratBadan >= minimalBB) {
        println("berat badan Gal Gadot = ${yourBB.beratBadan.toInt()}")
        // println("Gal Gadot: actual age = ${yourBB.actualBB.toInt()}")
        println("Selamat anda lolos masuk TNI")
    } else {
        println("Maaf anda belum lolos masuk TNI")
    }
}

class nilaiBulat {

    var beratBadan: Double = 59.8
        get() = field
        set(value) {
            field = if (value >= 59.6)
                60.0
            else if (value in 59.3..59.5)
                58.0
            else
                value - 3
        }
//
//    var actualBB: Double = 0.0

}




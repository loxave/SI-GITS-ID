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

    val yourBB = nilaiBulatBB()
    val yourTB = nilaiBulatTB()

    val minimalBB = 59.6
    val minimalTB = 168
    yourBB.beratBadan = 59.8
    yourTB.tinggiBadan = 169

    if (yourBB.beratBadan > minimalBB && yourTB.tinggiBadan > minimalTB) {
        repeat(2) {
            println("Selamat anda berhasil lolos test!!")
        }
        println("dengan rincian nilai: ")
        println("berat badan  = ${yourBB.beratBadan.toInt()}")
        println("berat badan  = ${yourTB.tinggiBadan}")

    } else {
        repeat(3) {
            println("Maaf anda belum lolos test ")
        }
    }
}

class nilaiBulatBB {
    var beratBadan: Double = 59.8
        //pada method get ada value field. field adalah value dari variable tinggiBadan
        get() = field
        // pada method set berisi value, yang mana value didapat dari field itu sendiri
        set(value) {
            field = if (value >= 59.6)
                60.0
            else if (value in 59.3..59.5)
                58.0
            else
                value - 3
        }
}

class nilaiBulatTB {

    var tinggiBadan: Int = 169
        //pada method get ada value field. field adalah value dari variable tinggiBadan
        get() = field
        // pada method set berisi value, yang mana value didapat dari field itu sendiri
        set(value) {
            field = if (value > 168)
                169
            else if (value < 168)
                167
            else
                0
        }
}

/**
 * Program sederhana terkait seleksi masuk TNI untuk proses seleksi dengan menggunakan method getter and setter
 * untuk mengambil data dari satu variable, kemudian data tadi diset serta diberi validasi
 * apakah data lebih/kurang dari value yang ditentukan.
 */



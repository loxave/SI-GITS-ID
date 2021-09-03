package assisgnmentGITS

import java.util.*

fun main() {


    val inputScanner = Scanner(System.`in`)
    val kelasA: Int
    var anak = 1

    print("Jumlah Anak: ")
    kelasA = inputScanner.nextInt()
    println(kelasA)


    while (anak <= 49) {
        ++anak
        if (anak % 2 == 0) {
            println("Untuk Anak-anak absen GENAP $anak mendapat TV")
            continue
        } else if (anak % 1 == 0) {
            println("Untuk Anak-anak absen GANJIL $anak mendapat sepeda")
        } else {
            println("Kamu anak mana?")
        }

    }

}
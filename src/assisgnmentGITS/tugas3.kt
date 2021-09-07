package assisgnmentGITS

import java.util.*

fun main() {

    //Program sederhana menggunakan while untuk mencetak output
    //mendapatkan tv atau sepeda
    //berdasarkan nomor absen anak, dan memberikan kondisi
    // apakah absen bernilai ganjil atau genap


    val inputScanner = Scanner(System.`in`)
    val kelasA: Int
    var anak = 1

    print("Jumlah Anak: ")
    kelasA = inputScanner.nextInt()
    println(kelasA)

    /**
    Menggunakan while karena, saat variable anak banding value = 49
    akan loop karena variable anak lebih kecil dibanding value = 49
    dan ketika lebih kecil dari value, akan berjalan ke post increment pada variable
    anak (anak++), saat turun ke blok selanjutnya, akan diberikan kondisi, ketika
    anak yang memiliki absen genap akan mencetak output:
    Untuk Anak-anak absen GENAP $anak mendapat TV
    dan turun di blok selanjutnya, ketika kondisinya anak yang memiliki absen ganjil
    akan mencetak output:
    Untuk Anak-anak absen GANJIL $anak mendapat sepeda
    ketika sudah tidak ada lagi yang diberikan kondisi, akan ada output default.
    finish
     **/
    while (anak <= 49) {
        anak++
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
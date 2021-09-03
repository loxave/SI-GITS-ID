package assisgnmentGITS

import java.util.*

fun main() {

//    var sepeda = 1
//    val anggota = 100

//    while (sepeda <= 100) {
//        if (sepeda <= anggota) {
//            println("Silahkan ambil sepedanya di depan")
//            sepeda--
//            break
//        } else if (sepeda >= anggota) {
//            println("Maaf, stok sepeda cuma dikit, mohon menunggu tahun depan ")
//        } else {
//            println("Gak ada sepeda adanya permen")
//
//        }
//
//    }

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
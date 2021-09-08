package assignmentGITS


/**
lambda, try catch, arrayList, for bersarang, function

tasks :
Buatlah perulangan (for & while) dengan data impelmentasi
ArrayListOf bebas memuat data apa aja melalui Intellij Idea,
serta menerapkan lambda pada kotlin.

Contoh Implementasi Looping.
Contoh Case Data Buah Favorite Mangga, Apel,
dst...(ArrayListOf) dibuat perulangan,
dan mencetak value menggunakan lambda. **/

fun main() {

    fun tugas4() {
        val arrFruitList = arrayListOf("Pineapple", "Pear", "Orange", "Watermelon")

        //Menggunakan for untuk mencetak apa saja isi yang ada pada variable arrFruitList
        //dan mencetak berdasarkan angka awal yang dimulai dari 0 -> 1 -> 2 -> 3 dan seterusnya

        println("---------Using For---------")
        //Mengganti isi variable yang berada pada variable arrFruitList urutan ke-0
        arrFruitList[0] = "Apple"
        //Menambahkan isi variable pada urutan ke-4
        arrFruitList.add(4, "Avocado")
        for (item in arrFruitList) {
            print(" $item\n")
        }

        /**
        Menggunakan While loop untuk mencetak isi dari variable arrFruitList yang mana
        untuk mencetak isi dari variable arrFruitList berdasarkan sizenya, dan menambahkan variable
        baru yaitu count untuk membandingkan apakah isi dari variable arrFruitList lebih besar
        dari variable count, serta menambahkan variable count menjadi post increment agar ketika
        program dijalankan tidak menimbulkan over looping berkepanjangan.

         **/
        println("---------Using While Loop---------")
        var count = 0
        while (arrFruitList.size > count) {
            println("Result: $arrFruitList")
            count++
        }

// Dengan lambda expression, bisa membuat function tanpa harus mendeskripsikan function nya

        println("Lastly, the result must be using Lambda")
        println("---------Using Lambda---------")
        val lambdaFruit: (String) -> String = { arrFruitList: String ->

            val result = arrFruitList
            println(result).toString()
        }
        lambdaFruit("Result: $arrFruitList")
    }
    tugas4()
}











package assisgnmentGITS


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

        println("---------Using For---------")
        arrFruitList[0] = "Apple"
        arrFruitList.add(4, "Avocado")
        for (item in arrFruitList) {
            print(" $item\n")
        }
        println("---------Using While Loop---------")
        var count = 0
        while (arrFruitList.size > count) {
            println("Result: $arrFruitList")
            count++
        }

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











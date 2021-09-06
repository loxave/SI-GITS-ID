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

    var arrFruitList = arrayListOf<String>("Pineapple", "Pear", "Orange", "Watermelon")

    arrFruitList[0] = "Apple"
    arrFruitList.add(4, "Avocado")
    for (item in arrFruitList) {
        println("Result : $item")
    }

    while (true) {

        println("ArrayList using while")
        arrFruitList.add()

    }


}





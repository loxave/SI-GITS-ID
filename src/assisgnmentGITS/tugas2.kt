package assisgnmentGITS

import java.util.*

fun main(args: Array<String>) {

    val operator: String
    val number1: Int
    val number2: Int
    val result: Int

    val writeAThing = Scanner(System.`in`)

    println("first number : ")
    number1 = writeAThing.nextInt()

    print(
        "choose an operator: " +
                "*" +
                "/" +
                "*" +
                "-"
    )
    operator = writeAThing.next()

    print("second number: ")
    number2 = writeAThing.nextInt()

    if (operator == "*") {
        result = number1 * number2
        print("Result is: $result")
    } else if (operator == "/") {
        result = number1 / number2
        print("Result is: $result")
    } else if (operator == "+") {
        result = number1 + number2
        print("Result is: $result")
    } else if (operator == "-") {
        result = number1 + number2
        print("Result is: $result")
    } else {
        print("Operator not found")
    }

    /** Study case pada tugas ini, menginputkan 2 angka secara bebas lalu memilih operator seperti +,-,*,/
    untuk melihat hasil akhir berdasarkan angka yang diinput serta operator yang dipilih.
     **/
}
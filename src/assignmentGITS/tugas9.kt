package assignmentGITS

class ChoiceOne {

    val chooseWhat = "Choose what you love?"

    inner class Girls {

        val bestChoice = "Catriona?"

        fun anotherChoice() = "Citra?"
    }

    class anotherGirls {

        val theChoice = "Mamong"
        fun anotherChoice2() = "Tamara"
    }
}


fun main() {

    val whatILove = ChoiceOne()
    println(whatILove.chooseWhat)

    if (whatILove.equals("Citra")) {
        println("The choice is: ${whatILove.Girls().anotherChoice()}")
    } else {
        println("The choice is: ${whatILove.Girls().bestChoice}")

        val whatIChoose = ChoiceOne.anotherGirls()
        println(whatIChoose.theChoice)
        println(whatIChoose.anotherChoice2())
    }
}
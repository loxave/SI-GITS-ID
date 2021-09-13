package assignmentGITS


//Outer Class
class ACompany {

    val whatMeans =
        "Tokopedia is an Indonesian technology company with a mission to democratize commerce through technology. " +
                "\nWe are the leading marketplace in Indonesia; we encourage millions of merchants and consumers to participate in the future of commerce. " +
                "\nOur vision is to build an ecosystem where everyone can start and discover anything with ease."


    //inline class with inner
    inner class Employee {

        val employerName = "Zen Fanny Parulian Pardosi"
        fun position() = "Software Engineer - Android"
        fun jobDescription() =
            "Design improvements to our existing product (in the Android) platform by utilizing core Computer Science\nthought processes and focusing on our customer's needs. "
    }

    //inline class without inner
    class CEO {

        val ceoName = "William Tanu"
        fun company() = "Tokopedia"
        fun nation() = "Indonesia"

    }

}


//after creating outer class - inline class, do print in main function.
fun main() {

    println("=========================================================================================\n")

    val header = ACompany()
    println(header.whatMeans)

    val cLevel = ACompany.CEO()
    println("CEO : ${cLevel.ceoName}")
    println("Company : ${cLevel.company()}")
    println("Nation : ${cLevel.nation()}")


    val eLevel = ACompany()
    println("\nName: ${eLevel.Employee().employerName}")
    println("Position: ${eLevel.Employee().position()}")
    println("Job Description: ${eLevel.Employee().jobDescription()}")

}
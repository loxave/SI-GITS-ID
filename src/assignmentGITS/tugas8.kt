package assignmentGITS

open class BestAutomobile(
    val brand: String, val famousModel: String, val marketCapitalization: Double,
    val brandDescription: String
) {

    open fun nameBrand() {
        println("$brand is Tesla")
    }

    open fun nameFamousModel() {
        println("Famous Model is$famousModel Tesla Model S")
    }

    open fun market() {
        println("Tesla’s market capitalization is around \$802.53 billion$marketCapitalization ")
    }

}

class Automobile(
    isBrand: String,
    isFamousModel: String,
    isMarketCapitalization: Double,
    isBrandDescription: String = "Description: "
) :
    BestAutomobile(isBrand, isFamousModel, isMarketCapitalization, isBrandDescription) {

    override fun nameBrand() {
        println("$brand Tesla, Inc")
    }

    override fun nameFamousModel() {
        println("$famousModel Tesla Model S - Full-size sedan")
    }

    override fun market() {
        println("is $802.53 $marketCapitalization")
    }
}


fun main() {

    val bestAutoMobile = Automobile(
        "Tesla",
        "Tesla Model S - Full-size sedan",
        802.53,
        "Tesla is maintaining its position as the eighth-most valuable automaker worldwide. \nTesla’s engineer and technology entrepreneur CEO Elon Musk, " +
                "\nthough brilliant and bold moves in the market, \nhas also proven an erratic and unreliable approach to its success."
    )

    bestAutoMobile.nameBrand()
    bestAutoMobile.nameFamousModel()
    bestAutoMobile.market()
    println(bestAutoMobile.brandDescription)
}
package assignmentGITS


class StartupLocal(name: String, founder: String, founded: String, location: String) {

    val companyName = name
    var founder = founder
    var founded = founded
    val location = location


    fun show(): String {

        return "Top Decacorn Local based in Indonesia \n" +
                "\nCompany Name: $companyName" +
                "\nFounder: $founder" +
                "\nFounded: $founded" +
                "\nLocation: $location"
    }
}

class FinanceStartup(companyName: String, founder: String, industry: String, investor: String) {

    val companyName = companyName
    var founder = founder
    var industry = industry
    var putInvestor = investor

    fun show2(): String {

        return "\nTop Startup Local based in Indonesia\n" +
                "\nCompany Name: $companyName" +
                "\nFounder: $founder" +
                "\nProduct: $industry" +
                "\nInvestor: $putInvestor"
    }

}


fun main() {

    val techStartup = StartupLocal("Tokopedia", "William Tanuwijaya", "August 2009", "Jakarta, Indonesia")

    println(techStartup.show())

    val financeStartup = FinanceStartup(
        "DANA Indonesia",
        "Vincent Henry", "Fintech, Financial Service", "East Ventures"
    )
    financeStartup.show2()

    println(financeStartup.show2())
}
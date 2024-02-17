fun main() {
    val stations = listOf(
        "El Marg", "Ain Shams", "Helmeyet El-Zaitoun", "Saray El-Qobba", "Heliopolis Square (formerly Orouba)",
        "Haroun El-Rashid", "Alf Maskan", "El-Matareyya", "Ain Shams University", "El-Marghani",
        "Nasser", "Sadat (formerly Mubarak)", "Saad Zaghloul", "El Geish (formerly Bab El Shaaria)",
        "Attaba", "El Shohadaa (formerly Martyrs)", "Ghamra", "El Demerdash", "Manshiet El-Sadr",
        "Al Sayeda Zeinab", "Saad Zaghloul", "Sadat", "Gamal Abdel Nasser", "Al-Ahram", "Kozzika",
        "Cairo University", "Faisal", "Giza"
    )
    println("Enter your Start station")
    val start = readLine()
    println("Enter your end station")
    val end = readLine()
    if(start !in stations || end !in stations || stations.indexOf(start)==stations.indexOf(end))
    {
        println("You have entered wrong input. Please enter valid station names.")
        return
    }
    val estimatedStations = if (stations.indexOf(start) < stations.indexOf(end)) {
        stations.subList(stations.indexOf(start), stations.indexOf(end) + 1)
    } else {
        stations.subList(stations.indexOf(end), stations.indexOf(start) + 1).reversed()
    }

    var price:Byte = 0
    if (estimatedStations.size<=9)

        price = 5.toByte()
else if (estimatedStations.size<=16)
        price = 7.toByte()
    else
        price = 10.toByte()
    val direction = if (stations.indexOf(start) < stations.indexOf(end)) "towards" else "back from"

        println("You are traveling $direction ${estimatedStations.drop(1)}")
    println("Ticket Price : $price EGP")
    println("Time : ${(estimatedStations.size-1)*2} ")
}

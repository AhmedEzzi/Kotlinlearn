fun main() {
    val stations1 = listOf(
        "El Marg", "Ain Shams", "Helmeyet El-Zaitoun", "Saray El-Qobba", "Heliopolis Square (formerly Orouba)",
        "Haroun El-Rashid", "Alf Maskan", "El-Matareyya", "Ain Shams University", "El-Marghani",
        "Nasser", "Sadat (formerly Mubarak)", "Saad Zaghloul", "El Geish (formerly Bab El Shaaria)",
        "Attaba", "El Shohadaa (formerly Martyrs)", "Ghamra", "El Demerdash", "Manshiet El-Sadr",
        "Al Sayeda Zeinab", "Saad Zaghloul", "Sadat", "Gamal Abdel Nasser", "Al-Ahram", "Kozzika",
        "Cairo University", "Faisal", "Giza"
    )
    val stations2 = listOf(
        "Shubra El Kheima", "Kolleyyet El-Zeraa", "Mezallat", "Khalafawy", "St. Teresa", "Ain Shams",
        "El-Marg", "Ezbet El-Nakhl", "Manshiet El-Sadr", "Helmeyet El-Zaitoun", "Heliopolis Square", "Haroun El-Rashid",
        "Alf Maskan", "Road El-Farag", "Attaba", "Sadat", "Mohammed Naguib", "Opera", "Dokki", "El-Bahr El-A'azam",
        "Giza"
    )


    val stations3 = listOf(
        "Cairo International Airport", "El Nozha", "El Ahram", "Koleyet El Banat", "City of the Dead (El'arafeen)",
        "Haroun El Rashid", "Attaba", "Ramses", "Boulaq", "Opera Square", "Dokki", "Kit Kat", "Imbaba"
    )
    println("Enter your Start station")
    val start = readLine()
    println("Enter your end station")
    val end = readLine()
    if (start == end) {
        println("Start and end stations cannot be the same.")
        return
    }
    val sameLine = when {
        start in stations1 && end in stations1 -> true
        start in stations2 && end in stations2 -> true
        start in stations3 && end in stations3 -> true
        else -> false
    }
    if (!sameLine) {
        println("You have entered stations on different lines. Print when it same line")
        return
    }
    val stations = when {
        start in stations1 -> stations1
        start in stations2 -> stations2
        else -> stations3
    }

    val estimatedStations = if (stations.indexOf(start) < stations.indexOf(end)) {
        stations.subList(stations.indexOf(start), stations.indexOf(end) + 1)
    } else {
        stations.subList(stations.indexOf(end), stations.indexOf(start) + 1).reversed()
    }

    var price:Byte = 0
    if (estimatedStations.size<=9)

        price = 6.toByte()
    else if (estimatedStations.size<=16)
        price = 8.toByte()
    else
        price = 16.toByte()
    val direction = if (stations.indexOf(start) < stations.indexOf(end)) "towards" else "back from"

    println("You are traveling $direction ${estimatedStations.drop(1)}")
    println("Ticket Price : $price EGP")
    println("Time : ${(estimatedStations.size-1)*2} ")
}
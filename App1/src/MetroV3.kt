fun main() {
    val stations1 = listOf(
        "helwan",
        "Ain Helwan",
        "Helwan unv",
        "Wadi Hof",
        "Hadayek Helwan",
        "El-maasara",
        "Tora El-asmant",
        "Kozzika",
        "Tora El-Balad",
        "Sakanat El-Maadi",
        "maadi",
        "Hadayek El-Maadi",
        "Dar El-Salam",
        "El-Zahraa",
        "Mar Girgis",
        "El-Malek El-Saleh",
        "Al-Sayeda Zeinab",
        "Saad Zaghloul",
        "Sadat",
        "Nasser",
        "Orabi",
        "Al-Shohadaa",
        "Ghamra",
        "El-Demerdash",
        "Manshiet El-Sadr",
        "Kobri El-Qobba",
        "Hammamat El-Qobba",
        "Saray El-Qobba",
        "Hadayeq El-Zaitoun",
        "Helmeyet El-Zaitoun",
        "El-Matareyya",
        "Ain Shams",
        "Ezbet El-Nakhl",
        "el-marg",
        "new el-marg"
    )

    val stations2 = listOf(
        "El-Mounib",
        "Sakiat Mekky",
        "Omm El-Masryeen",
        "El Giza",
        "Faisal",
        "Cairo University",
        "El Bohoth",
        "Dokki",
        "Opera",
        "Sadat",
        "Mohamed Naguib",
        "Attaba",
        "Al-Shohadaa",
        "Masarra",
        "Road El-Farag",
        "St. Teresa",
        "Khalafawy",
        "Mezallat",
        "Kolleyyet El-Zeraa",
            "Shubra El-Kheima"
    )
    val stations3 = listOf(
        "adly mansour",
        "hikestep",
        "omar ibn alkhattab",
        "keba'a",
        "hesham barakat",
        "al nozha",
        "shams club",
        "alfa maskan",
        "heliopolis squre",
        "haroun",
        "alahram",
        "koleyet albanat",
        "cairo stadium",
        "fair zone",
        "abassiya",
        "abdo basha",
        "geish",
        "bab alshareya",
        "attaba",
        "Nasser",
        "maspiro","safaa hegazy",
        "kitkat"
    )

    println("Enter your Start station")
    val start = readLine()
    println("Enter your end station")
    val end = readLine()

    var startIndex = 0
    var endIndex = 0
    var totall = ""
    var count = 0
    if (start == end) {
        println("Start and end stations cannot be the same.")
        return
    }
    else if (start in stations1 && end in stations2) {
        startIndex = stations1.indexOf(start)
        endIndex = stations2.indexOf(end)
    } else if (start in stations2 && end in stations1) {
        startIndex = stations2.indexOf(start)
        endIndex = stations1.indexOf(end)
    }
 else if (start in stations1 && end in stations3) {
    startIndex = stations1.indexOf(start)
    endIndex = stations3.indexOf(end)
}
    else if (start in stations3 && end in stations1) {
        startIndex = stations3.indexOf(start)
        endIndex = stations1.indexOf(end)
    }
///////////Line1////////////////////

    if (start in stations1 && end in stations2) {
        if (startIndex <= stations1.indexOf("Sadat") && startIndex < stations1.indexOf("Al-Shohadaa")) {
            println("Change in  Sadat")
            val lan1 = stations1.slice(startIndex until stations1.indexOf("Sadat"))
            val estimatedStations = if (endIndex > stations2.indexOf("Sadat")) {
                stations2.slice(stations2.indexOf("Sadat") until endIndex)
            } else {
                stations2.slice(stations2.indexOf("Sadat") downTo endIndex)
            }
            count = lan1.count() + estimatedStations.count()
            totall = "${lan1 + estimatedStations}"
        } else if (startIndex >= stations1.indexOf("Sadat")) {
            println("Change in  Al-Shohadaa")
            val lan1 = if (startIndex >= stations1.indexOf("Al-Shohadaa")) {
                stations1.slice(startIndex downTo stations1.indexOf("Al-Shohadaa"))
            } else {
                stations1.slice(startIndex until stations1.indexOf("Al-Shohadaa"))
            }
            val estimatedStations = if (endIndex > stations2.indexOf("Al-Shohadaa[c]")) {
                stations2.slice(stations2.indexOf("Al-Shohadaa[c]") until endIndex)
            } else {
                stations2.slice(stations2.indexOf("Al-Shohadaa[c]") downTo endIndex)
            }
            count = lan1.count() + estimatedStations.count()
            totall = "${lan1 + estimatedStations}"
        }
    }
    ////////////////////////////////////////////////////line 2 to 1////////////////////
    if (start in stations2 && end in stations2){
        if (startIndex <= stations2.indexOf("Sadat")&& startIndex <stations2.indexOf("Al-Shohadaa")) {
            println("Change in  Sadat")
            val lan1 = stations2.slice(startIndex until stations2.indexOf("Sadat"))
            val estimatedStations = if(endIndex >stations1.indexOf("Sadat")){
                stations1.slice(stations1.indexOf("Sadat") until endIndex)
            }else{
                stations1.slice(stations1.indexOf("Sadat") downTo  endIndex)
            }
            count = lan1.count() + estimatedStations.count()
            totall = "${lan1 + estimatedStations}"
        }else if (startIndex >= stations2.indexOf("Sadat")) {
            println("Change in  Al-Shohadaa")
            val lan1 = if (startIndex >= stations2.indexOf("Al-Shohadaa")) {
                stations2.slice(startIndex downTo (stations2.indexOf("Al-Shohadaa") + 1))
            } else {
                stations2.slice(startIndex until stations2.indexOf("Al-Shohadaa"))
            }
            val estimatedStations = if (endIndex > stations1.indexOf("Al-Shohadaa")) {
                stations1.slice(stations1.indexOf("Al-Shohadaa")..endIndex)
            } else {
                stations1.slice(stations1.indexOf("Al-Shohadaa") downTo endIndex)
            }
            count = lan1.count() + estimatedStations.count()
            totall = "${lan1 + estimatedStations}"
            println(lan1 - 1)
            println(estimatedStations)
        }

    }
    /////////////////////Line1 to Line 3//////////
    if (start in stations1 && end in stations3) {
        if (startIndex <= stations1.indexOf("Nasser") && end in stations3) {
            println("Change in  Nasser")
            val lan1 = stations1.slice(startIndex until stations1.indexOf("Nasser"))
            val estimatedStations = if (endIndex > stations3.indexOf("Nasser")) {
                stations3.slice(stations3.indexOf("Nasser") until endIndex)
            } else {
                stations3.slice(stations3.indexOf("Nasser") downTo endIndex)
            }
            count = lan1.count() + estimatedStations.count()
            totall = "${lan1 + estimatedStations}"
        }
    }
    if (start in stations3 && end in stations1) {
        if (startIndex <= stations3.indexOf("Nasser") || startIndex >= stations3.indexOf("Nasser") && end in stations1) {
            println("Change in  Nasser")
//            val lan1 = stations3.slice(startIndex until stations3.indexOf("Nasser"))
            val lan3 = if (startIndex <= stations3.indexOf("Nasser")) {
                stations3.slice(startIndex until      stations3.indexOf("Nasser"))
            } else {
                stations3.slice(startIndex downTo    stations3.indexOf("Nasser"))
            }
            val estimatedStations = if (endIndex > stations1.indexOf("Nasser")) {
                stations1.slice(stations1.indexOf("Nasser") until endIndex)
            } else {
                stations1.slice(stations1.indexOf("Nasser") downTo endIndex)
            }
            println(lan3)
            //println(estimatedStations)
            count = lan3.count() + estimatedStations.count()
            totall = "${lan3 + estimatedStations}"
        }
    }
    /////////////////////////////
    var price:Byte = 0
    if (count<=9)
        price = 6.toByte()
    else if (count<=16)
        price = 8.toByte()
    else if (count<=23)
        price = 12.toByte()
    else
        price = 15.toByte()
    println("You are traveling  $totall")
    println("Ticket Price : $price EGP")
    println(count)
    println("Time : ${(count*2)} ")

}
package com.example.metroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var startTxtbox:EditText
    lateinit var endTxtbox:EditText
lateinit var lanResualt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startTxtbox=findViewById(R.id.startTxtbox)
        endTxtbox=findViewById(R.id.endTxtbox)
lanResualt=findViewById(R.id.lanResult)
    }

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
        "Al-Shohadaa[c]",
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
        "Omm El-Masryeen[c]",
        "El Giza",
        "Faisal",
        "Cairo University",
        "El Bohoth",
        "Dokki",
        "Opera",
        "Sadat",
        "Mohamed Naguib",
        "Attaba",
        "Al-Shohadaa[c]",
        "Masarra",
        "Road El-Farag",
        "St. Teresa",
        "Khalafawy",
        "Mezallat",
        "Kolleyyet El-Zeraa",
        "Shubra El-Kheima"
    )
    var startIndex = 0
    var endIndex = 0
    var line=""
    fun startfun(view: View) {
        val start = startTxtbox.text.toString()
        val end = endTxtbox.text.toString()
        if (start == end) {
            Toast.makeText(this,"Start and end stations cannot be the same.",Toast.LENGTH_LONG).show()
        }

        val estimatedStations = if (stations1.indexOf(start) < stations1.indexOf(end)) {
            stations1.subList(stations1.indexOf(start), stations1.indexOf(end) + 1)
        } else {
            stations1.subList(stations1.indexOf(end), stations1.indexOf(start) + 1).reversed()
        }
        var price:Byte = 0
        if (estimatedStations.size<=9)

            price = 5.toByte()
        else if (estimatedStations.size<=16)
            price = 7.toByte()
        else
            price = 10.toByte()


        val direction = if (stations1.indexOf(start) < stations1.indexOf(end)) "towards" else "back from"

        line = "Ticket Price : $price EGP \n" +
                " Time : ${(estimatedStations.size - 1) * 2} \n " +
                "You are traveling :$direction ${estimatedStations.drop(1)}\n  "
        if(line in lanResualt.text.toString()){
            Toast.makeText(this,"line exists",Toast.LENGTH_LONG).show()
        }else
        {
            val newContent = line
            lanResualt.text = newContent

        }

    }
}
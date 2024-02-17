fun main()
{
val languages = arrayOf("English","Arabic","German","French","Japanese")
val accent = arrayOf("American English", "British English")
var known:Byte = 0
var not:Byte = 0
var accentNo=0

for (langu in languages) {
    println("Do you speak $langu")
    val answer= readln()
    if (answer=="yes")
    {
        known++
        var tryAgain = 2
        if (langu=="English")
        {

            do{
                for (aces in accent) {
                    println("Do you speak $aces")
                    val accAnswer = readln()
                    if (accAnswer == "yes") {
                        break
                    } else if (accAnswer == "no")
                    {accentNo++}
                    val x= accent.size
                    if (accentNo == x) {
                        accentNo=0
                        tryAgain--

                    }

                }
if (tryAgain==0)
    accentNo=accent.size
            } while (tryAgain>0)

            if(accentNo==accent.size)
            {
                known--
                not++
            }
        }
    }
    else if(answer=="no")
    {
        not++
    }
    else{
        println("Wrong answer dude")
    }

}
println("Your Yes : $known and no : $not" )




}
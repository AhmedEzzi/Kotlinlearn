//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    val languages = arrayOf("English","German","French","Italino")
    var known =0
    var not =0
    var answer=""
    repeat(languages.size)
 {
        println("Do you speak ${languages[it]}")
     answer = readln()
     if (languages[it]=="English"&&answer == "yes"){

         println("Do you speak British")
          answer = readln()
         println("Do you speak American")
         answer = readln()
     }
     if(answer=="yes")
         known++
     else if (answer == "no")
         not++
     else
         println(" Wrong input dude")
 }
    println("Yes : $known")
    println( "No : $not")

println(" Your rate  is Yes : ${known*100/languages.size}")
    println("No :${not*100/languages.size} ")

}
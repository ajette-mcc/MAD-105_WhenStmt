fun main(args: Array<String>) {
    //MAD-105 When Statement Assignment due 24-Jan-2022

    var Entry_Num: Int = 1
    var German_Name = "X"

    while (Entry_Num !=0 ) {
        print("Enter an integer number 1..9 to display German spelling of thee number, enter 0 to exit: ")
        Entry_Num = readLine()!!.toInt();
        when (Entry_Num) {
            1 -> German_Name = "Eins"
            2 -> German_Name = "Zwei"
            3 -> German_Name = "Drei"
            4 -> German_Name = "Vier"
            5 -> German_Name = "Funf"
            6 -> German_Name = "Sechs"
            7 -> German_Name = "Sieben"
            8 -> German_Name = "Acht"
            9 -> German_Name = "Neun"
            !in 1..9 -> German_Name = "Out of Range"
            else -> German_Name = "Are you messing with me"
        }
        if (Entry_Num != 0)
            println("German spelling of your number is: $German_Name")
    }
    println("Program arguments: ${args.joinToString()}")
}
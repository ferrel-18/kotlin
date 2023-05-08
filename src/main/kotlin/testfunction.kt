import kotlin.math.sqrt

fun main(args: Array<String>) {
    hesabu()
    println(sqrt(45.20))
    myfunctions("Favel",18,"Maloba")
    myfunctions("Lenny",20,"Chokwe")
}
fun myfunctions(fname:String,Age:Int,lname:String){

    println("My First name is $fname and i am $Age years old")
    println("My First name is $fname and i am $Age years old and i always use my last name $lname as a family name for recognition")
    println("$fname $lname i have always been on Raila's side for the last $Age years")
}
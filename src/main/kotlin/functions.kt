fun favel(){
    println("This is a cutomized user defined function")
}
fun hesabu(){
    val num=5
    val num1=8
    println("The sum of $num and $num1 is ${num+num1}")
}
fun deduction(){
    val num4=54
    val num5=76
    println("The difference btwn $num5 and $num4 is ${num5-num5} ")
}

fun names(){
    val myclass= arrayOf("Favel","Lenny","Nicole","Helen","Anwar","Eunice")
    println("My name is ${myclass[1]}")
}
fun main(args: Array<String>) {
    favel()
    hesabu()
    deduction()
    names()
}
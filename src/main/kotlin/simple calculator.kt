fun main(args: Array<String>) {
    print("Enter first number:")
    val num1= readLine()?.toDouble()?:0.0

    print("Input an operator:(+,-,/,*)")
    val operator= readln()
    print("Enter the second number:")
    val num2= readLine()?. toDouble()?:0.0

    val result= when (operator){
        "+"-> num1 + num2

        "-"-> num1 - num2
        "/"-> num1 / num2
        "*"-> num1 * num2
        else->{
            println("Invalid operator. Please try again")
            return
        }
    }
    println("The result is: $result")
}
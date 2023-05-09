class Words(){
    val myword:String="Hello"

    fun write():String{
        return myword
    }
}

fun main(args: Array<String>) {
    val myobject=Words()
    println(myobject.write() +" Favel")
}
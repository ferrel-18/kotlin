fun main(args: Array<String>) {
    val character = 'A'

    when (character) {
        'A' -> println("A is a vowel")
        'E' -> println("E is a vowel")
        'I' -> println("I is a vowel")
        'O' -> println("A is a vowel")
        'U' -> println("U is a vowel")

        else -> println("$character is a constant")
    }
}
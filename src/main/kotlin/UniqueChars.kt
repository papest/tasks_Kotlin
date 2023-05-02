/** Unique characters
Write a program that reads a word and prints the number of characters that appear in it only once.
 */
fun main() {
    val word = readln()
    val map: Map<Char, Int> = word.toSet().associateWith { i -> word.count { it == i } }
    println(map.count { (_: Char, value: Int) -> value == 1 })
}
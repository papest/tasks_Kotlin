/**
 * Number of occurrences
 * You are given a List of strings and a String in the input.
 * Calculate the number of occurrences of the String in the List.
 */
fun count(strings: List<String>, str: String): Int = strings.indices.filter { i -> strings[i] == str }.count()

fun main() {
    println(count(listOf("Fred", "Pola", "Mike", "Fred"), "Fred"))
}
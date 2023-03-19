/**
 * The second of T
 * Iterate through every second element of a list in a loop and find the index of the first word that starts with T.
 * It is guaranteed that at least one word with an odd index starts with T
 */

fun oddIndexT(names: List<String>): Int = names.indices.filter { it % 2 == 1 }.first { names[it][0] == 'T' }

fun main() {
    println(oddIndexT(listOf("Test", "Kora", "Terra", "Tetta", "Garry")))
}
/**
 * Even numbers
 * You are given a List of integers. Iterate through the given List and print in a single line the elements that are
 * divisible by 2.
 */

fun printEven(numbers: List<Int>) = print(numbers.filter { it % 2 == 0 }.joinToString(" "))

fun main() {
    printEven(listOf(8, 11, 13, 2))
}
/**
 * Indexes
 * In the input, you are given a List of products that you put on the shelf and a String that represents
 * a specific product. Print out this product's position on the shelf. Note that products may repeat.
 */

fun printProductIndex(products: List<String>, product: String) {
    product.withIndex()
    val result = mutableListOf<Int>()
    for (i in products.indices) {
        if (products[i] == product) result.add(i)
    }
    if (result.isNotEmpty()) println(result.joinToString(" "))
}

fun main() {
    printProductIndex(listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs"), "Eggs")
}
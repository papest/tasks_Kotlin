/**
 * Complete the function concatenate() that concatenates three strings into one using a special separator.
 * If the separator is not specified, use a single space. This function must return the resulting string.
 */

fun concatenate(first: String, second: String, third: String, separator: String = " "): String =
    "$first$separator$second$separator$third"
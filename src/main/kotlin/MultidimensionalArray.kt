fun main() {
    /**
     * Correct initializations of a multidimensional array
     */
    val array2 = arrayOf(
        arrayOf(),
        arrayOf<Any>()
    )
    val arrayMD = arrayOf(
        arrayOf(booleanArrayOf(true, true), arrayOf(1, 1)),
        arrayOf(arrayOf(1, 1), booleanArrayOf(true, true))
    )
    val n = arrayOf(
        FloatArray(0),
        FloatArray(1),
        DoubleArray(2)
    )
    val array1 = arrayOf(
        arrayOf('q', 'w', 'e'),
        arrayOf('r', 't', 'y')
    )

    /**
     * Create a 2x3 matrix (2-dimensional array) where each element consists of two indices that correspond to it. So elements of this array are strings denoting the indices of each element.
     * ou should output matrix, using the function contentDeepToString()
     */

    val array = arrayOf(
        arrayOf("[0][0]", "[0][1]", "[0][2]"),
        arrayOf("[1][0]", "[1][1]", "[1][2]")
    )
    println(array.contentDeepToString())

    /**
     * Create a 3x3x3 three-dimensional array that contains elements of type Int and is filled with zeros (0).
     * Print it using the function contentDeepToString()
     */

    val zero2D = Array(3) { IntArray(3) }
    val cubOfZero = Array(3) { zero2D }
    println(cubOfZero.contentDeepToString())
}
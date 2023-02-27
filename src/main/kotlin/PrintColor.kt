import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
Print color
Write the code for the function printColor(myImage: BufferedImage).
It reads 2 integers x and y (divided by space) and then gets the color at the position (x, y) of myImage.
Finally, it prints the color values in the following order: Red, Green, Blue, Alpha, with a single space between
the values.
 */
fun main() {
    val inputFile =
        File(
            System.getProperty("user.home") + File.separator + "Downloads" + File.separator +
                    "07827_20220402_1411100.jpg"
        )
    val myImage = ImageIO.read(inputFile)
    printColor(myImage)
}

fun printColor(myImage: BufferedImage) {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val color = Color(myImage.getRGB(x, y), true)

    println("${color.red} ${color.green} ${color.blue} ${color.alpha}")
}

import java.io.File

/** Find a directory with the max number of files
Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91404/basedir.zip.

If you unpack and open it, you will see a lot of directories containing files.

You must write a program that finds a directory with the maximum number of files.

Enter the name of the directory and the number of files in it separated by a space.

For example:

dir0 0
 */

fun main() {
    val basedir = File(
        System.getProperty("user.home") + File.separator + "Downloads" + File.separator
                + "basedir 4"
    )
    var name = basedir.name
    var max = 0

    basedir.listFiles().filter { it.isDirectory }.forEach {
        val size = it.list().size
        if (size > max) {
            max = size
            name = it.name
        }
    }

    println("$name $max")
}
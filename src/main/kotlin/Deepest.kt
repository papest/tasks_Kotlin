import java.io.File

/**
 * The deepest file
Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91426/basedir.zip.

If you open it, you will see a hierarchy of files.

Write a program that finds the deepest file (or directory) in this hierarchy.

Enter the name of the file you will get.

For example:

FAf9SDqa5h
 */

fun main() {
    val basedir = File(
        System.getProperty("user.home") + File.separator + "Downloads" + File.separator
                + "basedir 3"
    )
    val max = basedir.walk().maxOf { it.absolutePath.split(File.separator).size }

    basedir.walk().forEach { if (it.absolutePath.split(File.separator).size == max) println(it.name) }
}


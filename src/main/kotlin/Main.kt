import java.io.File

/**
 * Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91407/basedir.zip.

If you open it, you will see a lot of directories containing subdirectories and/or files. A subdirectory may be empty or may contain some files.

Your task is to write a program that finds all empty subdirectories in this hierarchy.

Enter the names of the directories separated by a space in any order.

For example:

subdir28-1 subdir29-2 subdir30-3
 */

fun main() {
    val basedir = File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "basedir 2")
    basedir.walk().filter { it.isDirectory && it.list().isEmpty() }
        .forEach { print("${it.relativeTo(it.parentFile)} ") }
}
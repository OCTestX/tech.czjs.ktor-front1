package tech.czjs.utils.files

import java.io.File

fun File.append(name: String): File = File(this, name)
fun File.mustDir(): File = this.apply {
    if (!exists()) mkdirs()
    if (!isDirectory) throw Exception("Not a directory")
}
fun File.mustFile(): File = this.apply {
    if (!exists()) createNewFile()
    if (!isFile) throw Exception("Not a file")
}
fun File.emptyFile(): File = this.apply {
    if (exists()) delete()
    createNewFile()
}
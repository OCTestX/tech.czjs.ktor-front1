package tech.czjs.conf

import tech.czjs.utils.files.append
import java.io.File

val workingDirectory = File("workingDir")
val assetsDir = workingDirectory.append("assets")
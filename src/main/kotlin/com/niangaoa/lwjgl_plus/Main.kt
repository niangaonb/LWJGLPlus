package com.niangaoa.lwjgl_plus

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import org.graalvm.polyglot.Value
import java.io.File




fun main(args: Array<String>) {
    val polyglot = Context.newBuilder().allowAllAccess(true).build()
    val file = File("polyglot")
    val source: Source = Source.newBuilder("llvm", file).build()
    val cpart: Value = polyglot.eval(source)
    cpart.execute()
}
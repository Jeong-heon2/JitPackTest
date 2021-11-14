package com.kdjj.lib_anno

@Target(AnnotationTarget.CLASS)
annotation class Validation

// String field
@Target(AnnotationTarget.FIELD)
annotation class MinLength(
    val length: Int,
)

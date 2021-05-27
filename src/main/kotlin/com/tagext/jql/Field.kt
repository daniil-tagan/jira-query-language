package com.tagext.jql

open class Field {
    lateinit var value: String

    companion object {
        val PROJECT = Field.fromString("project")

        fun fromString(str: String) = Field().apply { value = "$str" }
        fun custom(id: Int) = Field().apply { value = "cf[$id]" }
    }
}
package com.example.test_pam

import kotlin.contracts.ReturnsNotNull

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler eror
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "you can keep a null here"
    // Thiss is ok
    nullable = null


    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null



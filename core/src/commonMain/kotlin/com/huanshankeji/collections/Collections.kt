package com.huanshankeji.collections

fun List<*>.areElementsDistinct() =
    // There is a more efficient implementation.
    distinct().size == size

fun <T> List<T>.eachCount() =
    groupBy { it }.mapValues { it.value.size }
// This is tested to be faster than the implementation below in some scenarios.
//groupingBy { it }.eachCount()

// see https://discuss.kotlinlang.org/t/singleornull-whats-your-expectation/12085/14
fun <T> Iterable<T>.singleOrNullIfEmpty() =
    if (none()) null else single()

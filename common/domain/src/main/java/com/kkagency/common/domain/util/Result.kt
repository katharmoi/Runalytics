package com.kkagency.common.domain.util

sealed interface Result<out T, out E : Error> {
    data class Success<out T>(val data: T) : Result<T, Nothing>
    data class Error<out E : com.kkagency.common.domain.util.Error>(val error: E) :
        Result<Nothing, E>
}

inline fun <T, E : Error, R> Result<T, E>.map(transform: (T) -> R): Result<R, E> {
    return when (this) {
        is Result.Success -> Result.Success(transform(data))
        is Result.Error -> Result.Error(error)
    }
}

fun <T, E : Error> Result<T, E>.asEmpty(): EmptyResult<E> {
    return map { }
}

typealias EmptyResult<E> = Result<Unit, E>

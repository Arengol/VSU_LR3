package ru.vsu.vladimir.vsu_lr3.networkRepo.responses

sealed class ResponseWrapper<out T> {
    data class Success<out T>(val value: T) : ResponseWrapper<T>()
    data object NetworkError : ResponseWrapper<Nothing>()
}
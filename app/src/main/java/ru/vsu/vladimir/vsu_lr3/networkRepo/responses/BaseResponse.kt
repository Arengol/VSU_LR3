package ru.vsu.vladimir.vsu_lr3.networkRepo.responses

data class BaseResponse(
    val baseCurrency: String,
    val rates: List<RatesResponse>
)

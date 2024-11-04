package ru.vsu.vladimir.vsu_lr3.networkRepo.responses

data class RatesResponse(
    val currency: String,
    val currentRate: Double,
    val averageRatesLast5Days: List<AverageRatesLast5DaysResponse>
)

package ru.vsu.vladimir.vsu_lr3.networkRepo

import android.util.Log
import ru.vsu.vladimir.vsu_lr3.networkRepo.responses.CurrencyAPIService
import ru.vsu.vladimir.vsu_lr3.networkRepo.responses.RatesResponse
import ru.vsu.vladimir.vsu_lr3.networkRepo.responses.ResponseWrapper

object NetworkRepo {
    private val currencyAPIService = CoinRetrofitClient.client.create(
        CurrencyAPIService::class.java
    )
    suspend fun getCurrencyInfo (): ResponseWrapper<List<RatesResponse>> = try {
        val response = currencyAPIService.getCurrencyData()
        Log.d("RETROFIT", response.toString())
        ResponseWrapper.Success(response.rates)
    }
    catch (e: Exception) {
        ResponseWrapper.NetworkError
    }
}
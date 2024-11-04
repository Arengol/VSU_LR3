package ru.vsu.vladimir.vsu_lr3.networkRepo.responses

import retrofit2.http.GET
import ru.vsu.vladimir.vsu_lr3.networkRepo.RetrofitLinks.ENDPOINT

interface CurrencyAPIService {
    @GET(ENDPOINT)
    suspend fun getCurrencyData(): BaseResponse
}
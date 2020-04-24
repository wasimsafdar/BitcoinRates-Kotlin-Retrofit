package dk.humma.bitcoinrates

import io.reactivex.Observable
import retrofit2.http.GET

interface GetData {

    @GET("prices?key=51d014089baa35cd6a33d5f852f40332")
    fun getData() : Observable<List<RetroCrypto>>
}
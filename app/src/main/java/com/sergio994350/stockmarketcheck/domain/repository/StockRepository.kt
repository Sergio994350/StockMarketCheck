package com.sergio994350.stockmarketcheck.domain.repository

import com.sergio994350.stockmarketcheck.domain.model.CompanyInfo
import com.sergio994350.stockmarketcheck.domain.model.CompanyListing
import com.sergio994350.stockmarketcheck.domain.model.IntradayInfo
import com.sergio994350.stockmarketcheck.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}
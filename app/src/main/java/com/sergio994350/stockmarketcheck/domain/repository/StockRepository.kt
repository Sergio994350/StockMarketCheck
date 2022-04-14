package com.sergio994350.stockmarketcheck.domain.repository

import com.sergio994350.stockmarketcheck.domain.model.CompanyListing
import com.sergio994350.stockmarketcheck.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}
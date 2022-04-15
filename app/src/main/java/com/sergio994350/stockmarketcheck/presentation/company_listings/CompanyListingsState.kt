package com.sergio994350.stockmarketcheck.presentation.company_listings

import com.sergio994350.stockmarketcheck.domain.model.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)

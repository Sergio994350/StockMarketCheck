package com.sergio994350.stockmarketcheck.presentation.company_info

import com.sergio994350.stockmarketcheck.domain.model.CompanyInfo
import com.sergio994350.stockmarketcheck.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

package com.sergio994350.stockmarketcheck.data.mapper

import com.sergio994350.stockmarketcheck.data.local.CompanyListingEntity
import com.sergio994350.stockmarketcheck.data.remote.dto.CompanyInfoDto
import com.sergio994350.stockmarketcheck.domain.model.CompanyInfo
import com.sergio994350.stockmarketcheck.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}
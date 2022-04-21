package com.sergio994350.stockmarketcheck.di

import com.sergio994350.stockmarketcheck.data.csv.CSVParser
import com.sergio994350.stockmarketcheck.data.csv.CompanyListingsParser
import com.sergio994350.stockmarketcheck.data.csv.IntradayInfoParser
import com.sergio994350.stockmarketcheck.data.repository.StockRepositoryImpl
import com.sergio994350.stockmarketcheck.domain.model.CompanyListing
import com.sergio994350.stockmarketcheck.domain.model.IntradayInfo
import com.sergio994350.stockmarketcheck.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}
package com.sergio994350.stockmarketcheck.domain.model

import java.time.LocalDateTime

data class IntradayInfo(
    val date: LocalDateTime,
    val close: Double
)

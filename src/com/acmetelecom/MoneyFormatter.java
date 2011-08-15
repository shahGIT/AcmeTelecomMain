package com.acmetelecom;

import java.math.BigDecimal;

/*
--------------Refactored
class MoneyFormatter {
    public static String penceToPounds(BigDecimal pence) {
        BigDecimal pounds = pence.divide(new BigDecimal(100));
        return String.format("%.2f", pounds.doubleValue());
    }
}
  */


class MoneyFormatter extends moneyFormaatterPound {
}
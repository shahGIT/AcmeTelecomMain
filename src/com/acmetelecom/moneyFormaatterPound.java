package com.acmetelecom;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: Shah
 * Date: 14/08/11
 * Time: 22:20
 * To change this template use File | Settings | File Templates.
 */
public class moneyFormaatterPound {
    public static String penceToPounds(BigDecimal pence) {
        BigDecimal pounds = pence.divide(new BigDecimal(100));
        return String.format("%.2f", pounds.doubleValue());
    }
}

package week2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;

public class TaxCalculation {
    public static void main(String[] args) {
        final double VAT_RATE = 1.23;
        final int QUANTITY = 10_000;

        double priceWithoutVat = 9.99;
        System.out.println(MessageFormat.format("Price without VAT: {0}", priceWithoutVat));

        double priceWithVat = priceWithoutVat * VAT_RATE;
        System.out.println(MessageFormat.format("Price with VAT: {0}", priceWithVat));

        double valueWithVat = priceWithVat * QUANTITY;
        System.out.println(MessageFormat.format("10,000 pcs of product with VAT: {0}", valueWithVat));

        double valueWithoutVat = valueWithVat / VAT_RATE;
        System.out.println(MessageFormat.format("10,000 pcs of product without VAT: {0}", valueWithoutVat));

        System.out.println("========================================");
        System.out.println("With BigDecimal");

        // Using BigDecimal
        BigDecimal bdPriceWithoutVat = new BigDecimal("9.99");
        System.out.println(MessageFormat.format("Price without VAT: {0}", bdPriceWithoutVat));

        BigDecimal bdPriceWithVat = bdPriceWithoutVat.multiply(new BigDecimal(Double.toString(VAT_RATE)));
        bdPriceWithVat = bdPriceWithVat.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(MessageFormat.format("Price with VAT (rounded): {0}", bdPriceWithVat));

        BigDecimal bdValueWithVat = bdPriceWithVat.multiply(new BigDecimal(QUANTITY));
        System.out.println(MessageFormat.format("10,000 pcs of product with VAT: {0}", bdValueWithVat));

        BigDecimal bdValueWithoutVat = bdValueWithVat.divide(new BigDecimal(Double.toString(VAT_RATE)), 2, RoundingMode.HALF_EVEN);
        System.out.println(MessageFormat.format("10,000 pcs of product without VAT: {0}", bdValueWithoutVat));
    }
}

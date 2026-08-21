package org.exercise7;

import java.math.BigDecimal;

public class SalesLine {
    private final Product product;
    private final int salesNum;

    public SalesLine(Product product, int salesNum){
        this.product = product;
        this.salesNum = salesNum;
    }

    public Product getProduct() {
        return product;
    }

    public int getSalesNum() {
        return salesNum;
    }

    public BigDecimal getLineTotal(){
        BigDecimal productPrice = new BigDecimal(String.valueOf(product.getPrice()));
        BigDecimal salesNum = new BigDecimal(getSalesNum());
        return productPrice.multiply(salesNum);
    }
}

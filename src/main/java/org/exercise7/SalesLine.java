package org.exercise7;

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

    public long getLineTotal(){
       return (product.getPrice() * salesNum);
    }
}

package org.exercise7;


import java.util.List;

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

    public double getLineTotal(){
       return (double) (product.getPrice() * salesNum)/100;
    }

    public static double getTotal(List<SalesLine> salesLineList){
        double total = 0;
        for (SalesLine salesLine: salesLineList) {
            total += salesLine.getLineTotal();
        }
        return total;
    }
}

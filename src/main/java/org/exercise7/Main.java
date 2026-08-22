package org.exercise7;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Calculator calculator = new Calculator();
        Reports reports = new Reports(calculator, calculator);

        List<Product> productList = new ArrayList<>();

        Product product1 = new Product("A001", "Laptop Lenovo", 1_000*100);
        Product product2 = new Product("A002", "Teclado Mecanico", 100*100);
        Product product3 = new Product("A003", "Funda de Laptop",100*100);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        List<SalesLine> salesLineList = new ArrayList<>();
        SalesLine salesProduct1 = new SalesLine(product1, 5);
        SalesLine salesProduct2 = new SalesLine(product2, 8);
        SalesLine salesProduct3 = new SalesLine(product3, 8);
        salesLineList.add(salesProduct1);
        salesLineList.add(salesProduct2);
        salesLineList.add(salesProduct3);

        System.out.println(salesProduct1.getLineTotal());
        System.out.println(reports.getTotal(salesLineList));

    }
}

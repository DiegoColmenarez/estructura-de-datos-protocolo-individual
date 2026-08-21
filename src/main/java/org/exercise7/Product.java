package org.exercise7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
   private final String name;
   private final String id;
   private final BigDecimal price;

    public Product (String id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }
    static void main() {

        // que no se te olvide borrar esto de aquí, fue una prueba rapida
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product("A001", "Laptop Lenovo", new BigDecimal("123.3"));
        Product product2 = new Product("A002", "Teclado Mecanico", new BigDecimal("23.6"));
        Product product3 = new Product("A003", "Funda de Laptop", new BigDecimal("12.3"));

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        List<SalesLine> salesLineList = new ArrayList<>();
        SalesLine salesProduct1 = new SalesLine(product1, 6);
        salesLineList.add(salesProduct1);

    }
}

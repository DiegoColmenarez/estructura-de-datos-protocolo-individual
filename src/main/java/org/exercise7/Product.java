package org.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Product {
   private String name;
   private String id;
   private float price;

    public Product (String id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    static void main() {

        // que no se te olvide borrar esto de aquí, fue una prueba rapida
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("A001", "Laptop Lenovo", 123.3F));
        productList.add(new Product("A002", "Teclado Mecanico", 23.6F));
        productList.add(new Product("A003", "Funda de Laptop", 12.3F));
        productList.add(new Product("A004", "Mouse inalambrico", 15.7F));
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }
}

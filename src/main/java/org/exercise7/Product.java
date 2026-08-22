package org.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Product {
   private final String name;
   private final String id;
   private final long priceInCent;

    public Product (String id, String name, long priceInCent){
        this.id = id;
        this.name = name;
        this.priceInCent = priceInCent;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public long getPrice() {
        return priceInCent;
    }
}

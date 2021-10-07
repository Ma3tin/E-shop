package com.company;

import java.util.ArrayList;

public class Eshop {
    String name;
    ArrayList<Product> products = new ArrayList<>();
    int sales = 0;

    public Eshop(String name) {
        this.name = name;
    }

    public void newProduct(Product product) {
        products.add(product);
    }

    public void sellProduct(Product product) {
        sales += product.getPrice();
        products.remove(product);

    }

    public int allSales() {
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice();
        }
        return total;
    }
}

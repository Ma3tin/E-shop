package com.company;

public class Main {
    public static void main(String[] args) {
        Product iphone13 = new Product("iphone 13", 13000, "haf");
        Product iphone12 = new Product("iphone 12", 10000, "daf");

        Eshop czc = new Eshop("czc");
        czc.newProduct(iphone12);
        czc.newProduct(iphone13);

        czc.sellProduct(iphone12);
        System.out.println("czc: " + czc.allSales());
    }

}

package com.esp;

class Product{
    public void buy(){
        System.out.println("Product is purchased");
    }
}

class ElectronicsProduct extends Product{
    public void buy(){
        System.out.println("Electronics Product is purchased");
    }
}

class ClothingProduct extends Product{
    public void buy(){
        System.out.println("Clothing Product is purchased");
    }
}

class StationeryProduct extends Product{}

public class ClassHierarchy {
    public static void main(String[] args) {
        Product p1 = new ElectronicsProduct();
        Product p2 = new ClothingProduct();
        Product p3 = new StationeryProduct();
        
        p1.buy();
        p2.buy();
        p3.buy();
    }
}

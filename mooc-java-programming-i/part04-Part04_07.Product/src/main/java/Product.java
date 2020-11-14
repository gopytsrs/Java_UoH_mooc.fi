/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void printProduct(){
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return name + ", " +  "price " + price + ", " + quantity + " pcs";
    }
}

package com.sales.dto;

public class ProductDTO {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public ProductDTO(String name,double price,int quantity){
        this.name=name;this.price=price;this.quantity=quantity;
    }

    public ProductDTO(int id,String name,double price,int quantity){
        this.id=id;this.name=name;this.price=price;this.quantity=quantity;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}

    public String toString(){
        return id+" "+name+" "+price+" "+quantity;
    }
}
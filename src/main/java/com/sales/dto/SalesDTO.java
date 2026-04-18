package com.sales.dto;

public class SalesDTO {
	private int productId,customerId,quantity;
    private double total;

    public SalesDTO(int p,int c,int q,double t){
        this.productId=p;
        this.customerId=c;
        this.quantity=q;
        this.total=t;
    }

    public int getProductId(){return productId;}
    public int getCustomerId(){return customerId;}
    public int getQuantity(){return quantity;}
    public double getTotal(){return total;}
}
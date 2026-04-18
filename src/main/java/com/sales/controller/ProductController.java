package com.sales.controller;

import java.io.*;
import com.sales.dao.impl.ProductDaoImpl;
import com.sales.dto.ProductDTO;

public class ProductController {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ProductDaoImpl dao=new ProductDaoImpl();

    {
        try{
            int ch;
            do{
                System.out.println("Enter 1 to Add Product\nEnter 2 to View Products\nEnter 3 to Exit from Product");
                ch=Integer.parseInt(br.readLine());

                if(ch==1){
                    System.out.println("Name:");
                    String n=br.readLine();
                    System.out.println("Price:");
                    double p=Double.parseDouble(br.readLine());
                    System.out.println("Qty:");
                    int q=Integer.parseInt(br.readLine());

                    dao.add(new ProductDTO(n,p,q));
                }

                if(ch==2){
                    dao.getAll().forEach(System.out::println);
                }

            }while(ch!=3);

        }catch(Exception e){e.printStackTrace();}
    }
}
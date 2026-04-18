package com.sales.view;

import java.io.*;
import com.sales.controller.*;

public class Dashboard {

    public static void main(String[] args)throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        UserController uc=new UserController();

        if(uc.start()){

            int ch;
            do{
                System.out.println("\nEnter 1 to Add Product details\nEnter 2 to Add Customer details\nEnter 3 to Add Sales details\n4 Exit");
                ch=Integer.parseInt(br.readLine());

                if(ch==1) new ProductController();
                if(ch==2) new CustomerController();
                if(ch==3) new SalesController();

                
            }while(ch!=4);
            
        }
    }
}
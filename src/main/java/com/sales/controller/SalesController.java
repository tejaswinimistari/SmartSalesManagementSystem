package com.sales.controller;
import java.io.*;
import com.sales.dao.impl.*;
import com.sales.dto.*;

public class SalesController {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    SalesDaoImpl dao=new SalesDaoImpl();
    ProductDaoImpl pd=new ProductDaoImpl();

    {
        try{
            System.out.println("Enter Product ID:");
            int pid=Integer.parseInt(br.readLine());

            System.out.println("Enter Customer ID:");
            int cid=Integer.parseInt(br.readLine());

            System.out.println("Enter Quantity:");
            int q=Integer.parseInt(br.readLine());

            double total=pd.find(pid).getPrice()*q;

            dao.createSale(new SalesDTO(pid,cid,q,total));

            System.out.println("Bill="+total);

        }catch(Exception e){e.printStackTrace();}
    }
}
package com.sales.controller;

import java.io.*;
import com.sales.dao.impl.CustomerDaoImpl;
import com.sales.dto.CustomerDTO;

public class CustomerController {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    CustomerDaoImpl dao=new CustomerDaoImpl();

    {
        try{
            System.out.println("Enter Full Name:");
            String n=br.readLine();
            System.out.println("Enter Email:");
            String e=br.readLine();

            dao.add(new CustomerDTO(n,e));
            System.out.println("Customer Added");

        }catch(Exception e){e.printStackTrace();}
    }
}
package com.sales.controller;

import java.io.*;
import com.sales.dao.impl.UserDaoImpl;
import com.sales.dto.UserDTO;

public class UserController {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    UserDaoImpl dao=new UserDaoImpl();

    public boolean start() throws Exception{

        int ch;
        do{
            System.out.println("Enter 1 to Signin of Admin\nEnter 2 to Login of Admin\nEnter 3 to Exit from Dashboard");
            ch=Integer.parseInt(br.readLine());

            if(ch==1){
                System.out.println("First Name:");
                String f=br.readLine();

                System.out.println("Last Name:");
                String l=br.readLine();

                System.out.println("Email:");
                String e=br.readLine();

                System.out.println("Phone No.:");
                String p=br.readLine();

                System.out.println("Password:");
                String pass=br.readLine();

                dao.register(new UserDTO(f,l,e,p,pass));
                System.out.println("Signin Successfull");
            }

            if(ch==2){
                System.out.println("Enter Email OR Phone No.:");
                String input=br.readLine();

                System.out.println("Password:");
                String pass=br.readLine();

                if(dao.login(new UserDTO(input,pass))){
                    System.out.println("Login Successfull");
                    return true;
                } else {
                    System.out.println("//Invalid Login Details//");
                }
            }

        }while(ch!=3);

        return false;
    }
}
package com.sales.dao.impl;

import java.sql.*;
import com.sales.dto.UserDTO;
import com.sales.utility.DbConnection;

public class UserDaoImpl {

    
    public boolean register(UserDTO u){
        try{
            Connection con=DbConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(
            "insert into tbl_user(first_name,last_name,email,phone,password) values(?,?,?,?,?)");

            ps.setString(1,u.getFirstName());
            ps.setString(2,u.getLastName());
            ps.setString(3,u.getEmail());
            ps.setString(4,u.getPhone());
            ps.setString(5,u.getPassword());

            return ps.executeUpdate()>0;

        }catch(Exception e){e.printStackTrace();}
        return false;
    }

    
    public boolean login(UserDTO u){
        try{
            Connection con=DbConnection.getConnection();

            PreparedStatement ps=con.prepareStatement(
            "select * from tbl_user where (email=? OR phone=?) AND password=?");

            ps.setString(1,u.getEmail());
            ps.setString(2,u.getEmail());
            ps.setString(3,u.getPassword());

            return ps.executeQuery().next();

        }catch(Exception e){e.printStackTrace();}
        return false;
    }
}
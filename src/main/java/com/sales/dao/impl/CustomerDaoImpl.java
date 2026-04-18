package com.sales.dao.impl;

import java.sql.*;
import com.sales.dto.CustomerDTO;
import com.sales.utility.DbConnection;

public class CustomerDaoImpl {

    public boolean add(CustomerDTO c){
        try{
            PreparedStatement ps=DbConnection.getConnection()
            .prepareStatement("insert into tbl_customer(first_name,email) values(?,?)");

            ps.setString(1,c.getName());
            ps.setString(2,c.getEmail());

            return ps.executeUpdate()>0;
        }catch(Exception e){e.printStackTrace();}
        return false;
    }
}
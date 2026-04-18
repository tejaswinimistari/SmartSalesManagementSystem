package com.sales.dao.impl;

import java.sql.*;
import com.sales.dto.SalesDTO;
import com.sales.utility.DbConnection;

public class SalesDaoImpl {

    public boolean createSale(SalesDTO s){
        try{
            PreparedStatement ps=DbConnection.getConnection()
            .prepareStatement(
            "insert into tbl_sales(product_id,customer_id,quantity,total_price) values(?,?,?,?)");

            ps.setInt(1,s.getProductId());
            ps.setInt(2,s.getCustomerId());
            ps.setInt(3,s.getQuantity());
            ps.setDouble(4,s.getTotal());

            return ps.executeUpdate()>0;
        }catch(Exception e){e.printStackTrace();}
        return false;
    }
}
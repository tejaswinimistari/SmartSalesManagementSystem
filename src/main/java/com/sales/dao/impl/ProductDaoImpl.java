package com.sales.dao.impl;

import java.sql.*;
import java.util.*;
import com.sales.dto.ProductDTO;
import com.sales.utility.DbConnection;

public class ProductDaoImpl {

    public boolean add(ProductDTO p){
        try{
            Connection con=DbConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(
            "insert into tbl_product(product_name,price,quantity) values(?,?,?)");

            ps.setString(1,p.getName());
            ps.setDouble(2,p.getPrice());
            ps.setInt(3,p.getQuantity());

            return ps.executeUpdate()>0;
        }catch(Exception e){e.printStackTrace();}
        return false;
    }

    public List<ProductDTO> getAll(){
        List<ProductDTO> list=new ArrayList<>();
        try{
            ResultSet rs=DbConnection.getConnection()
            .createStatement().executeQuery("select * from tbl_product");

            while(rs.next()){
                list.add(new ProductDTO(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4)
                ));
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    public ProductDTO find(int id){
        try{
            PreparedStatement ps=DbConnection.getConnection()
            .prepareStatement("select * from tbl_product where product_id=?");

            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return new ProductDTO(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4)
                );
            }
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
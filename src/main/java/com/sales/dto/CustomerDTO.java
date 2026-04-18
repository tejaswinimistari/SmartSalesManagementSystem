package com.sales.dto;

public class CustomerDTO {
	  private int id;
	    private String name,email;

	    public CustomerDTO(String name,String email){
	        this.name=name;this.email=email;
	    }

	    public int getId(){return id;}
	    public String getName(){return name;}
	    public String getEmail(){return email;}

}

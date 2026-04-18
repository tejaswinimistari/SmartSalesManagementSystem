package com.sales.dto;

public class UserDTO {

    private String firstName,lastName,email,phone,password;

    public UserDTO(String f,String l,String e,String p,String pass){
        this.firstName=f;
        this.lastName=l;
        this.email=e;
        this.phone=p;
        this.password=pass;
    }

    // for login
    public UserDTO(String e,String pass){
        this.email=e;
        this.password=pass;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmail(){return email;}
    public String getPhone(){return phone;}
    public String getPassword(){return password;}
}
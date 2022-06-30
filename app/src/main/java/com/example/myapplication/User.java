package com.example.myapplication;


public class User {
    public String id;
    public String contact;
    public String dateOfBirth;

    public void setData(String a,String b,String c){
        this.id = a;
        this.contact=b;
        this.dateOfBirth=c;
    }
    public String getData(){
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.id+"\n");
        buffer.append(this.contact+"\n");
        buffer.append(this.dateOfBirth+"\n");
        return buffer.toString();
    }
}
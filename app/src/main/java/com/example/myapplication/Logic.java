package com.example.myapplication;


import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public String getData(Cursor res, String givenName){

        // Cursor res = DB.getdata();
        List<User> l = new ArrayList<>();
        if(res.getCount()==0){
            return new String("record not found");
        }
        // StringBuffer buffer = new StringBuffer();

        while(res.moveToNext()){
            User user = new User();
            user.setData(res.getString(0), res.getString(1), res.getString(2));
            l.add(user);
        }
        for (User user :  l) {
            if (user.id.equals(givenName)) {
                return user.getData();
            }
        }
        return new String("record not found");
    }
}
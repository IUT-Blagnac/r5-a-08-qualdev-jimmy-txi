package com.mycompany.app.dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<String>();
    // setup base cocktails list
    public Order() {
    }

    public void declareOwner(String string) {
        // TODO Auto-generated method stub
        this.owner = string;
    }

    public void declareTarget(String string) {
        // TODO Auto-generated method stub
        this.target = string;
    }

    public List<String> getCocktails() {
        // TODO Auto-generated method stub
        return this.cocktails;
    }

}

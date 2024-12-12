package com.mycompany.app.dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    private Order order;
    
    @Given("{string} wants to buy a drink")
    public void wants_to_buy_a_drink(String owner) {
        order = new Order();
        order.declareOwner(owner);
    }
    
    @When("an order is declared for {string}")
           public void an_order_is_declared(String target) {
            order.declareTarget(target);
    }
    
    @When("<{int}> cocktail is added to the order, named {string}")
    public void cocktail_is_added_to_the_order_named(int nbCocktails, String string) {
        for (int i = 0; i < nbCocktails; i++) {
            order.getCocktails().add(string);
        }
    }

    @Then("there is <{int}> cocktail in the order")
    public void there_is_cocktail_in_the_order(int nbCocktails) {  
        List<String> cocktails = order.getCocktails();
        assertEquals(nbCocktails, cocktails.size());
    }

    @Given("{string} wants to buy {int} drink")
    public void wants_to_buy_drink(String string, int nbCocktails) {
        order = new Order();
        order.declareOwner(string);
        for (int i = 1; i < nbCocktails; i++) {    
            order.getCocktails().add("Mojito");
        }
    }




}
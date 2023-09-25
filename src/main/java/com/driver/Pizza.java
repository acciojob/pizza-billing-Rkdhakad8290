package com.driver;

public class Pizza {

    private int billPrice; // Total peice
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int paperBagPrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.billPrice =300;
            this.toppingsPrice=70;
        }
        else{
            this.billPrice =400;
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;
        this.paperBagPrice=20;

        this.bill = "base Price Of The Pizza: "+this.billPrice+"\n";
    }

    public int getBillPrice(){
        return this.billPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            billPrice = billPrice +cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded==false){
            billPrice=billPrice+toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperBagAdded==false){
            billPrice=billPrice+paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here

        if (isBillGenerated==false){
            if (isCheeseAdded){
                bill=bill+ "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if (isToppingsAdded){
                bill=bill+ "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if (isPaperBagAdded){
                bill=bill+ "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            bill=bill+ "Total Price: "+billPrice+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}

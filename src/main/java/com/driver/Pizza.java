package com.driver;

public class Pizza {

    private int price; // Total peice
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
            this.price =300;
            this.toppingsPrice=70;
        }
        else{
            this.price =400;
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;
        this.paperBagPrice=20;

        this.bill = "Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            price = price + cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded==false){
            price = price +toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isPaperBagAdded==false){
            price = price +paperBagPrice;
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
            bill=bill+ "Total Price: "+ price +"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}

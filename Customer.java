package com.roza;

public class Customer extends Person {
    public String purchasedMedicineName;
    public int barcodeNumber;
    public double price;
    

    // Constructor
    public Customer(String name, String purchasedMedicineName, int barcodeNumber, double price){
        super (name);
        this.purchasedMedicineName = purchasedMedicineName;
        this.barcodeNumber = barcodeNumber;
        this.price = price;
        System.out.println(name +" is a new Customer\n");
    }

    // Setters & Getters

    public String getPurchasedMedicineName() {
        return purchasedMedicineName;
    }

    public void setPurchasedMedicineName(String purchasedMedicineName) {
        this.purchasedMedicineName = purchasedMedicineName;
    }

    public int getBarcodeNumber() {
        return barcodeNumber;
    }

    public void setBarcodeNumber(int barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //  Methods

    public String toString(){
        return "Customer Name: " + getName() + "\nPurchased Medicine: " +getPurchasedMedicineName()
                + "\nBarcode: " +getBarcodeNumber() + "\nPrice: " + getPrice() + "/= \n";
    }

}

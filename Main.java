package com.roza;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Customer("Catana" , "Motrin",198534375 , 2.50);
        System.out.println(p1.toString());

        Person p2 = new Staff( "John", 1200, "9.00 AM - 5.00 PM");
        System.out.println(p2.toString() );
    }
}

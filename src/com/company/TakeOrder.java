package com.company;

public class TakeOrder {

    public TakeOrder(){
        System.out.println("Menu: \n" +
                "Beer \n \t1. Budwiser 500ml \t 1.25 \u20ac \n \t2. Budwiser 300ml \t 1.00 \u20ac \n" +
                "Apertizers \n \t3. Nachos \t 3.00 \u20ac \n \t4. Loaded French Fries \t 2.50 \u20ac \n" +
                "Main courses \n \t5. Ribs \t 5.00 \u20ac \n \t6. Hamburger and Fries \t 5.00 \u20ac \n" +
                "Desserts \n \t7. Brownies with Ice Cream \t4.00 \u20ac \n \t8. Chocolate Cake \t 4.00 \u20ac \n");

        System.out.println("Enter the number of the item you would like to order. Once you are done ordering type 'done'.");
    }
}

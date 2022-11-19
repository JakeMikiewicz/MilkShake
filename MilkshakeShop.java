// Milkshake Project
// Jake Mikiewicz
// Due in December 2022

// November 18 update
// I will be incorporating the factory pattern into this file in the future, so I'll re-write this.

import java.util.Scanner;
import util;
import util.Milkshake;
import util.AssertNotNullTest;

class Program {
    public static void SleepXSeconds(int seconds) {
        seconds = seconds * 1000; // number of milliseconds to sleep
        long start = System.currentTimeMillis();
        while(start >= System.currentTimeMillis() - seconds);
    }

    public static void clearScreen() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
    } 
}

public class MilkshakeShop {

    private static MilkshakeShop instance = null;
 
    public static MilkshakeShop getInstance() {
        if (instance == null) {
            instance = new MilkshakeShop();
        }
        return instance;
    }
 
    public MilkshakeShop orderMilkshake(String size) {
        Milkshake order = new Milkshake();
        if (size.contentEquals("small")) {
            order.SmallMilkshake();

        } else if (size.contentEquals("medium")) {
            order.MediumMilkshake();
 
        } else if (size.contentEquals("large")) {
            order.LargeMilkshake();

        } else if (size.contentEquals("x-large")) { 
            order.XLargeMilkshake();

        } else {
            return null;
        }
        return null;
    }

    public static void main(String args[])
    {
        Program.clearScreen();
        Program.SleepXSeconds(1);

        System.out.println("Welcome to Jake's Milkshake Shop!");
        Program.SleepXSeconds(2);

        System.out.println("Please select an option to order a milkshake.");
        System.out.println("You may enter 'exit' to quit the store. ");
        System.out.print("Type small, medium, large, or x-large: ");
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
        String size = sc.next();

        MilkshakeShop shop = new MilkshakeShop();
        Milkshake drink = new Milkshake();
        

        // ordering sticker
        drink.order(size);
        Program.SleepXSeconds(2);
        Program.clearScreen();
        shop.orderMilkshake(size);

        System.out.println("Enjoy that creamy decliciousness!");

        // close scanner for cleanliness
        sc.close();
        
    }
}

// Java Milkshake file

// November 18 update:
// I will be completely rewriting this file to incorporate the Factory pattern design. I feel better working on that type of design pattern.

import java.util.*;

public class Milkshake {

	public void order(String size) {
		if (size.contentEquals("small") || size.contentEquals("medium") || size.contentEquals("large") || size.contentEquals("x-large")) {
			System.out.println("Ordering " + size + " milkshake...");
		} else if (size.contentEquals("exit")) {
			System.out.println("Thank you for visiting!");
			Program.SleepXSeconds(2);
			System.exit(0);
		} else {
			System.out.println("Sorry, invalid option. Please try again.");
			System.out.println("Restarting store...");
			Program.SleepXSeconds(2);
			MilkshakeShop.main(null);
		}
	}

	public void SmallMilkshake() {
        System.out.println("Small milkshake ordered!");
    }
    public void MediumMilkshake() {
        System.out.println("Medium milkshake ordered!");
    }
    public void LargeMilkshake() {
        System.out.println("Large milkshake ordered!");
    }
    public void XLargeMilkshake() {
        System.out.println("X-Large milkshake ordered!");
    }
}


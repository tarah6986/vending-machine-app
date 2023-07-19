/**
 * This class inherits from the VendingItems abstract class
 */

package com.techelevator.view;
public class Candy extends VendingItems {
    /**
     * The parameters are passed to the constructor of the superclass ("VendingItems") using the "super" keyword.
     */
    public Candy(String code, String name, double price, String type, int quantity) {
        super(code, name, price, type, quantity);
    }

    /**
     * The code also overrides the "playSound()" method of the "VendingItems" class, which returns a string to customer.
     * @return String message to customer
     */
    @Override
    public String playSound() {
        return "Munch Munch, Yum!";
    }
}

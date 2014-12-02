import java.io.*;
import java.util.*;
import java.text.*;

/**
 * A class to learn how the ArrayList class works
 */
public class LearnArrayListWithIterators
{
    // Initial names and amounts
    String names[] = {"Harry", "Hermione", "Ron", "Albus", "Bellatrix", "Lupid", "Sirius", "Moaning Myrtle", "Rubeus", "Dobby"};
    double amounts[] = {10.13, 1249.33, 824.01, 86.86, 928.72, 1612.29, 1220.90, 278.47, 1000.99, 1716.13};

    // Declare and initialize a new empty array list
    public ArrayList<BankAccount> accountList = new ArrayList<>();
    
    /** 
     * Add accounts to the array list
     */
    public void addAccounts() {
        // 1. Loop through the names and amounts arrays and 
        // 2. Instantiate an instance of BankAccount for each name/amount pair
        // 3. Use an Iterator object to insert the BankAccount instance into the 
        //    ArrayList arrayList
    }
    
    /** 
     * Get the account with the largest balance
     * @return The BankAccount object with the largest balance
     */
    public BankAccount getLargestBalance() {
        // Use an Iterator object to loop through the accounts in accountList and 
        // return the account with the largest balance.  Remember that the for loop
        // described in the online textbook is incorrect and will not work!!  Use a
        // while loop with the iterator instead.
    }
}
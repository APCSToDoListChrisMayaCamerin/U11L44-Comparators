import java.io.*;
import java.util.*;
import java.text.*;

/**
 * A class to create BankAccounts and load them into an ArrayList
 */
public class BankAccounts 
{
    // Initial names and amounts
    String names[] = {"Harry", "Hermione", "Ron", "Albus", "Bellatrix", "Remus", "Sirius", "Moaning Myrtle", "Rubeus", "Dobby"};
    double amounts[] = {10.13, 1249.33, 824.01, 86.86, 928.72, 1612.29, 1220.90, 278.47, 1000.99, 1716.13};

    // Declare and initialize a new empty array list
    public ArrayList<BankAccount> accountList = new ArrayList<>();
    
    /** 
     * Add accounts to the array list 
     */
    public void addAccounts() {
        for (int i=0; i<names.length; i++) {
            accountList.add(new BankAccount(names[i], amounts[i]));
        }
    }
    
    /**
     * Sort the accounts by the name using a custom Comparator
     */
    public void sortAccountsByName() {
        BankAccountComparatorByName accountComparator = new BankAccountComparatorByName();
        Collections.sort(accountList, accountComparator);
    }        
    
    /**
     * Sort the accounts by the balance using another custom Comparator
     */
    public void sortAccountsByBalance() {
        BankAccountComparatorByBalance accountComparator = new BankAccountComparatorByBalance();
        Collections.sort(accountList, accountComparator);
    }        
    
}

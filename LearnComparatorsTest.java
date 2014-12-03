import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LearnArrayListWithIteratorsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LearnComparatorsTest
{
    /**
     * Default constructor for test class LearnArrayListWithIteratorsTest
     */
    public LearnComparatorsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddAccounts()
    {
        BankAccounts bankAccounts = new BankAccounts();
        bankAccounts.addAccounts();
        assertEquals(928.72, bankAccounts.accountList.get(4).getBalance(), 0.1);
        assertEquals("Bellatrix", bankAccounts.accountList.get(4).getName());
    }

    @Test
    public void testSortByName()
    {
        BankAccounts bankAccounts = new BankAccounts();
        bankAccounts.addAccounts();
        bankAccounts.sortAccountsByName();
        assertEquals("Albus", bankAccounts.accountList.get(0).getName());
        assertEquals("Sirius", bankAccounts.accountList.get(bankAccounts.accountList.size()-1).getName());
    }

    @Test
    public void testSortByBalance()
    {
        BankAccounts bankAccounts = new BankAccounts();
        bankAccounts.addAccounts();
        bankAccounts.sortAccountsByBalance();
        assertEquals(10.13, bankAccounts.accountList.get(0).getBalance(), 0.1);
        assertEquals(1716.13, bankAccounts.accountList.get(bankAccounts.accountList.size()-1).getBalance(), 0.1);
    }
}



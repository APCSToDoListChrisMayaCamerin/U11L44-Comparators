

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
public class LearnArrayListWithIteratorsTest
{
    /**
     * Default constructor for test class LearnArrayListWithIteratorsTest
     */
    public LearnArrayListWithIteratorsTest()
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
        LearnArrayListWithIterators learnArr2 = new LearnArrayListWithIterators();
        learnArr2.addAccounts();
        assertEquals(928.72, learnArr2.accountList.get(4).getBalance(), 0.1);
        assertEquals("Bellatrix", learnArr2.accountList.get(4).getName());
    }

    @Test
    public void testGetLargestBalance()
    {
        LearnArrayListWithIterators learnArr1 = new LearnArrayListWithIterators();
        learnArr1.addAccounts();
        BankAccount largest = learnArr1.getLargestBalance();
        assertEquals((new BankAccount("Dobby", 1716.13)).getName(), largest.getName());
        assertEquals((new BankAccount("Dobby", 1716.13)).getBalance(), largest.getBalance(), 0.1);
    }
}



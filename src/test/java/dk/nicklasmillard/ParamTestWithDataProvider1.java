package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class ParamTestWithDataProvider1 {
    private PrimeNumberChecker primeNumberChecker;

    @BeforeMethod // Run this before testing
    public void init() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    @DataProvider(name = "test1") // Used as data provider for method below
    public static Object[][] primeNumbers() {
        return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }

    @Test(dataProvider = "test1") // Uses data provided by method above
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
        System.out.println(inputNumber + " " + expectedResult);
    }

}

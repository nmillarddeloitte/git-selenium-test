package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class GroupTest {
    String message = "Hello";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups =  {"functest", "checkintest"})

    public void testPrintMessage() {
        System.out.println("testPrintMessage");

        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = {"functest"})
    public void testAnotherPrintMessage() {
        System.out.println("testAnotherPrintMessage");

        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = {"checkintest"})
    public void testPrintSalutation() {
        System.out.println("testPrintSalutation");
        message += "Hi!";

        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}

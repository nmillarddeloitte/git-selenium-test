package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class IgnoreTest {
    String message = "Hello";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(enabled = false)
    public void testPrintMessage() {
        System.out.println("testPrintMessage");

        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("testSaulutationMessage");
        message += "Hi!";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}

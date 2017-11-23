package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class TestDepedencyUsingAnnotations {
    String message = "Hello";
    MessageUtil messageUtil = new MessageUtil(message);

    // Then this method will be called
    @Test
    public void testPrintMessage() {
        System.out.println("testPrintMessage");

        Assert.assertEquals(message, messageUtil.printMessage());
    }

    // And lastly this is called
    @Test(dependsOnMethods = {"initEnvTest"} )
    public void testSalutationMessage() {
        System.out.println("testSalutationMessage");
        message += "Hi!";

        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    // This test will be called first
    @Test
    public void initEnvTest() {
        System.out.println("init env test");
    }

}

package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class Test1 {
    private String message = "Hello world";
    private MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("testPrintMessage");
        Assert.assertEquals(this.message, messageUtil.printMessage());
    }
}

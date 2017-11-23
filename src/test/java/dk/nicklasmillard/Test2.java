package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class Test2 {
    private String message = "Hello world";
    private MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("testSalutationMessage");
        message += "Hi!";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}

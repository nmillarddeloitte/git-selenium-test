package dk.nicklasmillard;

import org.testng.annotations.*;
import org.testng.Assert;

public class TestParameterized {

    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameter is set to: " + myName);
    }

}

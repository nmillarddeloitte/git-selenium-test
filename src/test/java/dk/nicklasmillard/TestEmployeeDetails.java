package dk.nicklasmillard;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestEmployeeDetails {
    BusinessLogic bl = new BusinessLogic();
    EmployeeDetails ed = new EmployeeDetails();

    @Test
    public void testCalculateAppraisal() {
        ed.setAge(20);
        ed.setMonthlySalary(2000);
        ed.setName("Nick");

        double appraisal = bl.calculateAppraisal(ed);

        Assert.assertEquals(500, appraisal, 0.0, "500");
    }

    @Test
    public void testCalculateYearlySalary() {
        ed.setAge(20);
        ed.setMonthlySalary(2000);
        ed.setName("Nick");

        double salary = bl.calculateYearlySalary(ed);

        Assert.assertEquals(ed.getMonthlySalary() * 12, salary);
    }
}

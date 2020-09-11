package basics.TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(basics.TestNG.Listeners.Listener.class)
public class Class1 {
    @Test
    public void sum() {
        int sum = 0;
        int a = 5;
        int b = 7;
        sum = a + b;
        System.out.println(sum);
    }

    @Test
    public void testtofail() {
        System.out.println("Test case has been failed");
        Assert.assertTrue(false);
    }

    @Test
    public void testtopass() {
        System.out.println("Test case has been passed");
        Assert.assertTrue(true);
    }
}
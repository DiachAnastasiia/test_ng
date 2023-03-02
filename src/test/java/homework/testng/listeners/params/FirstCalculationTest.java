package homework.testng.listeners.params;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstCalculationTest implements TestingProcess, TestProcess {

    @Test(dataProvider = "getPlusData", dataProviderClass = CalculationData.class)
    public void plus(int x, int y, int result) {
        assertEquals(x + y, result);
    }

    @Test(dataProvider = "getMinusData", dataProviderClass = CalculationData.class)
    public void minus(int x, int y, int result) {
        assertEquals(x - y, result);
    }

    @Parameters(value = "key")
    @Test(expectedExceptions = AssertionError.class)
    //@Test
    public void test(@Optional("123") String param) {
        System.out.println(param);
        Assert.fail();
    }

    @Test
    public void testVariables() {
        String url = System.getProperty("url", "www.google.com");
        System.out.println(url);
    }
}

package homework.testng.listeners.params;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SecondCalculationTest implements TestingProcess, TestProcess {

    @Test(dataProvider = "getMultiplyData", dataProviderClass = CalculationData.class)
    public void multiply(int x, int y, int result) {
        assertEquals(x * y, result);
    }

    @Test(dataProvider = "getDivideData", dataProviderClass = CalculationData.class)
    public void divide(int x, int y, int result) {
        assertEquals(x / y, result);
    }
}

package homework.testng.listeners.params;

import org.testng.annotations.DataProvider;

public class CalculationData {

    @DataProvider
    public static Object[][] getPlusData() {
        return new Object[][]{
                { 2,  0,  2},
                { 0,  3,  3},
                { 2,  3,  5},
                {-2, -3, -5},
                { 2, -3, -1},
                {-2,  3,  1}
        };
    }

    @DataProvider
    public static Object[][] getMinusData() {
        return new Object[][]{
                { 3,  0,  3},
                { 0,  2, -2},
                { 3,  2,  1},
                {-3, -2, -1},
                { 3, -2,  5},
                {-3,  2, -5}
        };
    }

    @DataProvider
    public static Object[][] getMultiplyData() {
        return new Object[][]{
                { 2,  0,  0},
                { 0,  3,  0},
                { 2,  3,  6},
                {-2, -3,  6},
                { 2, -3, -6},
                {-2,  3, -6}
        };
    }

    @DataProvider
    public static Object[][] getDivideData() {
        return new Object[][]{
                { 0,  2,  0},
                { 6,  2,  3},
                {-6, -2,  3},
                {-6,  2, -3},
                { 6, -2, -3}
        };
    }
}

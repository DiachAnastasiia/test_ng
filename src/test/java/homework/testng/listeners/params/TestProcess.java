package homework.testng.listeners.params;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public interface TestProcess {

    @BeforeMethod(firstTimeOnly = true)
    default void startTest(Method method) {
        System.out.printf("'%s' test has been started\n", method.getName());
    }

    @AfterMethod(lastTimeOnly = true)
    default void finishTest(Method method) {
        System.out.printf("'%s' test has been finished\n", method.getName());
    }
}

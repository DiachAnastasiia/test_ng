package homework.testng.listeners.params;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public interface TestingProcess {

    @BeforeSuite
    default void startTesting() {
        System.out.println("Testing has been started.");
    }

    @AfterSuite
    default void finishTesting() {
        System.out.println("Testing has been finished.");
    }
}

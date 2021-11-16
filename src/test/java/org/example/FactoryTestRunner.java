package org.example;
import org.testng.annotations.Factory;

public class FactoryTestRunner {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new FactoryTest("first Test"),
                new FactoryTest("second Test")
        };
    }
}

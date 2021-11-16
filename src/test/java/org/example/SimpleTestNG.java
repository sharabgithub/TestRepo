package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestNG {

        @Test(priority = 1)
        public void loginTest() {
            System.out.println("This is the Login test");
        }
        @Test(priority = 2)
        @Parameters({"firstPar"})
        public void verifyTest(String firstPar) {
            System.out.println("This is the Verify test : "+firstPar);
        }
        @Test(priority = 3)
        public void logOut() {
            System.out.println("This is the Logout test");
        }
}

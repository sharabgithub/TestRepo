package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParams {

        @Test(dataProvider = "dataset1")
        public void loginTest(int a, String b) {
            System.out.println("This is the Login test: "+a+" "+b);
        }
        @Test(dataProvider = "dataset")
        public void verifyTest(String a, String b) {
            System.out.println("This is the Verify test: "+a+" "+b);
        }
        @Test
        public void logOut() {
            System.out.println("This is the Logout test");
        }

        @DataProvider(name = "dataset")
        public Object[][] myProvider(){
            return new Object[][]{
                    {"first0","first1"},
                    {"second0","second1"},
                    {"third0","third1"}
                                };
        }
        @DataProvider(name = "dataset1")
        public Object[][] myProvider1(){
            Object[][] data = new Object[2][2];
            data[0][0] = 123;
            data[0][1] = "Prasanna";
            data[1][0] = 2;
            data[1][1] = "Kumar";

            return data;
        }



}

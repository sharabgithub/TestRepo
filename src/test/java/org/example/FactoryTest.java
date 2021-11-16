package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FactoryTest {

        public String param = "";
        public FactoryTest(String param){
            this.param = param;
        }

        public void repeatMethod(int i){
            System.out.println("this printing from repeat method : "+i);
        }
        @Test
        public void loginTest() {
            System.out.println("This is the Login test :"+param);
        }
        @Test
        public void verifyTest() {
            System.out.println("This is the Verify test");
        }
        @Test
        public void logOut() {
            System.out.println("This is the Logout test");
        }

}

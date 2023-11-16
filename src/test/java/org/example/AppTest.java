package org.example;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class AppTest
{
    public void repeatMethod(int i){
        System.out.println("this is for git testing");
        System.out.println("this printing from repeat method : "+i);
    }

    @Test
    public void loginTest() {
        System.out.println("This is the Login test");
        for(int i=0; i<=3; i++) {
            repeatMethod(i);
        }
    }
    @Test(dataProvider = "myData")
    public void verifyTest(int a) {
        System.out.println("This is the Verify test :"+a);
    }

    @Test(dataProvider = "myData")
    public void logOut(int a) {
        System.out.println("This is the Logut test");
    }

    @DataProvider(name="myData")
    private Object[][] myDataPro(){
        Object[][] objArray;
        objArray =  new Object[][]{
            {1},{2},{3}
        };

        return objArray;
    }

}

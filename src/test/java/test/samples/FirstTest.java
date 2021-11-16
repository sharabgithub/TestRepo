package test.samples;

import org.example.FirstLib;
import org.junit.Test;

public class FirstTest {
    FirstLib flib = new FirstLib();
    @Test
    public void myTest(){
        System.out.println("this is PRASANNA first sample program");
        flib.reverseStr("this is PRASANNA first sample program");
    }
}

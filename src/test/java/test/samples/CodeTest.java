package test.samples;

import java.util.StringTokenizer;

public class CodeTest {
    public static void main(String[] args){
        String testStr = "This is the test string to check";
        String[] arrSplit = testStr.split(" ");
        int arrLength = arrSplit.length;
        String subStr = testStr.substring(12,16);

        StringTokenizer sToken = new StringTokenizer(testStr);

        System.out.println(arrSplit[3]);
        System.out.println(subStr);

        while(sToken.hasMoreElements()){
            System.out.println(sToken.nextElement());
        }
    }
}

package test.samples;

public class Reversecheck {
    public static void main(String[] args){
        String siteName = "www.this is prasanna.com";

        //=============Method 1==================
        char[] charSite = siteName.toCharArray();

        for(int i=(charSite.length)-1;i>=0;i--){
            char temp = charSite[i];
            System.out.print(temp);
        }
        System.out.println();
        String revName = "";
        //=============Method 2==================
        for(int i=(siteName.length())-1;i>=0;i--){
            revName = revName + siteName.charAt(i);
        }
        System.out.println(revName);
        //=============Method 3==================
        StringBuffer strBuffer = new StringBuffer(siteName);
        System.out.println(strBuffer.reverse());
        //=============Method 4==================
        StringBuilder strBuilder = new StringBuilder(siteName);
        System.out.println(strBuilder.reverse());
    }

}

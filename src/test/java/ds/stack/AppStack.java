package ds.stack;

public class AppStack {
    public static void main(String[] args) {
//        Stack intStack = new Stack(5);
//        intStack.push(500);
//        intStack.push(100);
//        intStack.push(10);
//        intStack.push(20);//
//        while(!intStack.isEmpty()){
//            long val = intStack.pop();
//            System.out.println(val);
//        }
        String revStr = reverStr("this is reverse string");
        System.out.println(revStr);
    }
        public static String reverStr(String str){
            int strmax = str.length();
            Stack charStack = new Stack(strmax);
            for(int i=0;i<str.length();i++){
                charStack.push(str.charAt(i));
            }
            String results = "";
            while(!charStack.isEmpty()){
                char ch = charStack.pop();
                results = results+ch;
            }
            return results;
        }
}

package adt;

public class ADTCounter {
    int value;
    public void ADTCounter(){
        this.value = 0;
    }
    public void increment(){
        value++;
    }
    public void getCounterVal(){
        System.out.println(value);
        System.out.println("this is direct update from github");
        
    }
}

package ds.stack;

public class Stack {
    int maxsize;
    char[] arrayStack;
    int top;

     public Stack(int size){
        this.maxsize = size;
        this.arrayStack = new char[maxsize];
        this.top = -1;
    }
    public void push(char j){
        if(isFull()){
            System.out.println("the stack is already full and can not be added now");
        }else{
         top++;
        arrayStack[top] = j;
        }
    }
    public char pop(){
         if(isEmpty()){
             System.out.println("the stack is empty and nothing is there to pop");
             return 0;
         }else {
             int old_top = top;
             top--;
             return arrayStack[old_top];
         }
    }
    public long peak(){
        return arrayStack[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (maxsize-1==top);
    }
}

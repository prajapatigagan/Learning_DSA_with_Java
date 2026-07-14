package Stack;

import java.util.*;

public class ReverseAStack {
    public static void pushatBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatBottom(s, data);
        s.push(top);
    }
    public static void ReverseAstack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        ReverseAstack(s);
        pushatBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
       Stack<Integer> temp = new Stack<>();
        temp.addAll(s);
        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Original Element : ");
        printStack(s);
        ReverseAstack(s);
        System.out.println("Reverse Element : ");
        printStack(s);
    }
    
}

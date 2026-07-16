package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    public void push(int value){
        stack.push(value);
        if(minstack.isEmpty()){
            minstack.push(value);
        }else{
            minstack.push(Math.min(value,minstack.peek()));
        }
    }
    public void pop(){
        stack.pop();
        minstack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minstack.peek();
    }
    public static void main(String[] args) {
        MinStack s=new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);

        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.getMin());

    }
}

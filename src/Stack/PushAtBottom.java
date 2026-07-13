package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void pushatbottom(Stack<Integer> S, int data){
        if(S.isEmpty()){
            S.push(data);
            return;
        }
        int top=S.pop();
        pushatbottom(S, data);
        S.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> S=new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        pushatbottom(S,4);
        while(!S.isEmpty()){
            System.out.println(S.pop());
        }
    }
    
}

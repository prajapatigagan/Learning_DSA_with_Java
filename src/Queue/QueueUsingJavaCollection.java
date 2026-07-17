package Queue;

import java.util.*;

public class QueueUsingJavaCollection {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        Queue<Integer> qu=new ArrayDeque<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
        
    }
    
}

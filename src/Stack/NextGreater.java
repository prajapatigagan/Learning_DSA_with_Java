package Stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        //next gerater right...
        int nxtGreater1[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater1[i]=-1;
            }
            else{
                nxtGreater1[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtGreater1.length;i++){
            s.clear();
            System.out.print(nxtGreater1[i]+" ");
        }
        System.out.println();

        //next greater left..
        int nxtGreater2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater2[i]=-1;
            }
            else{
                nxtGreater2[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtGreater2.length;i++){
            s.clear();
            System.out.print(nxtGreater2[i]+" ");
        }
        System.out.println();

        //next smaller right..
        int nxtsmaller1[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtsmaller1[i]=-1;
            }
            else{
                nxtsmaller1[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtsmaller1.length;i++){
            s.clear();
            System.out.print(nxtsmaller1[i]+" ");
        }
        System.out.println();

        //next smaller left..
        int nxtsmaller2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtsmaller2[i]=-1;
            }
            else{
                nxtsmaller2[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtsmaller2.length;i++){
          s.clear();  
            System.out.print(nxtsmaller2[i]+" ");
        }
        System.out.println();  
    }
}

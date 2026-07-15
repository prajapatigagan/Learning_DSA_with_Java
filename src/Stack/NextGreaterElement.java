package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int nums1[],int nums2[]){
        int nxtgreater1[]=new int[nums2.length];
        Stack<Integer> s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty()&&nums2[s.peek()]<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nxtgreater1[i]=-1; 
            }
            else{
                nxtgreater1[i]=nums2[s.peek()];
            }
            s.push(i);
        }
        int ans[]=new int[nums1.length];
        for(int i=0; i<nums1.length;i++){
            for(int j=0; i<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=nxtgreater1[j];
                    break;
                }
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        int[] ans = nextGreaterElement(nums1, nums2);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

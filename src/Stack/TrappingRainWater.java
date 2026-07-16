package Stack;

import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int nums[]={7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        int n=nums.length;
        int water=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&nums[i]>nums[s.peek()]){
                int top=s.pop();
                if(s.isEmpty()){
                    break;
                }
                int boundary=i-s.peek()-1;
                int boundaryheight=Math.min(nums[i],nums[s.peek()])-nums[top];
                water+=boundary*boundaryheight;
            }
            s.push(i);
        }
        System.out.println(water);

    }
    
}

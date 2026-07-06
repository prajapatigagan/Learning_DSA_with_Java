package TwoPointer;

import java.util.ArrayList;

public class ContainMostWater {
    public static int storewater(ArrayList<Integer> height){
        int n=height.size();
        int maxwater=0;
        int LP=0;
        int RP=n-1;
        while(LP<RP){
            int ht=Math.min(height.get(LP),height.get(RP));
            int width=RP-LP;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            if(height.get(LP)<height.get(RP)){
                LP++;
            }
            else{
                RP--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(4);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(storewater(height));
    }
}

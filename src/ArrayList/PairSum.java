package ArrayList;

import java.util.ArrayList;

public class PairSum {
    //bruth force approach
    // public static boolean pairsum(ArrayList<Integer> list1,int target){
    //     int n=list1.size();
    //     int result=0;
    //     for(int i=0; i<n;i++){
    //         for(int j=i+1;j<n; j++){
    //             if(list1.get(i)+list1.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //twopointer 
    public static boolean pairsum(ArrayList<Integer> list1,int target){
        int n=list1.size();
        int lp=0;
        int rp=n-1;
        while(lp!=rp){
            if(list1.get(lp)+list1.get(rp)==target){
                return true;
            }
            if(list1.get(lp)+list1.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int target=5;

        System.out.println(pairsum(list1, target));
    }
}

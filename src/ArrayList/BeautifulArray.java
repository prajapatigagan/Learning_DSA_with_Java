package ArrayList;

import java.util.ArrayList;

public class BeautifulArray {
    public ArrayList<Integer> beautifularray(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int e:ans){
                if (2 * e - 1 <= n)
                temp.add(2 * e - 1);
                }
            
            for(int e:ans){
                if (2 * e<= n)
                temp.add(2 * e);
                }
                ans = temp;
        }
        return ans;

    }
    public static void main(String[] args) {
         BeautifulArray obj = new BeautifulArray();

        System.out.println(obj.beautifularray(4));
    }
    
}

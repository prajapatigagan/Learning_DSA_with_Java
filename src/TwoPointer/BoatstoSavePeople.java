package TwoPointer;

import java.util.Arrays;

public class BoatstoSavePeople {
    public static int numRescueBoats(int people[],int target){
        int n=people.length;
        Arrays.sort(people);
        int i=0;
        int j=n-1;
        int boats=0;
        while(i<=j){
            if(people[i]+people[j]<=target){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) {
        int people[]={2,3,3,4,5};
        int target=5;
        System.out.println(numRescueBoats(people, target));
    }
}

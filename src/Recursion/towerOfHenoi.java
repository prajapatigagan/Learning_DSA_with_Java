package Recursion;

public class towerOfHenoi {
    public static void towerofhenoi(int n,String source,String helper,String disk){
        if(n==0){
            System.out.println("transfer disk "+n+" from "+source+" to "+disk);
            return;
        }
        towerofhenoi(n-1, source, disk, helper);
            System.out.println("transfer disk "+n+" from "+source+" to "+disk);
        towerofhenoi(n-1, disk,helper, source);
    }
    public static void main(String[] args) {
        int n=3;
           towerofhenoi(n,"S","H","D");
    }
    
}

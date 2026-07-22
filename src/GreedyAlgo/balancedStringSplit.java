package GreedyAlgo;

public class balancedStringSplit {
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL";

        int balance=0;
        int count=0;

        for(char ch:s.toCharArray()){
            if(ch=='L'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

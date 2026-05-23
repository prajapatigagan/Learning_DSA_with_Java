package Recursion;

public class last_occurence {
    public static int number(int arr[],int key,int i){
         if(i==arr.length){
            return -1;
        }
        int isfound=number(arr,key,i+1);
        if(isfound==-1&&arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={1,7,2,9,4,5,4,6,4};
        System.out.println(number(arr,4,0));
    }
    
}

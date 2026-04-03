package ARRAY_QUESTION;

public class PairInAnArray {
    public static void pair(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            count=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+count+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        pair(arr);
    }
}

package Recursion;

public class first_occurence {
    /**
     * @param arr
     * @param i
     * @param key
     * @return
     */
    public static int number(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return 1;
        }
        return number(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,7,2,9,4,5,4,6};
        System.out.println(number(arr,4,0));

    }
    
}

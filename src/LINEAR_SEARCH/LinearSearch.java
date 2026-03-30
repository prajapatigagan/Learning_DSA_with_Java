public class LinearSearch {
    public static int ElementSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
   
    }

    public static void main(String[] args) {
        int numbers[]={2,3,5,3,8,9};
        int key=30;
        int ans=ElementSearch(numbers,key);
        if(ans==-1){
             System.out.println("element not found");
        }
        else{
            System.out.println("element found an Index:"+ans);
        }
    }
}

public class CheckSortedArray{
    public static int  SortedCheck(int numbers[]){
        for(int i=0; i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
       }  
      
    }
       return 0; 
}
public static void main(String[] args) {
    int numbers[]={1,2,3,4,5,6,7,8,9};
    int ans=SortedCheck(numbers);
    if(ans!=0){
        System.out.println("Sorted Array");
    }
    else{
        System.out.println("UnSorted Array");
    }
}
}
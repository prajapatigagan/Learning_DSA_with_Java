public class FirstandLastOccurrence {
    public static void ElementSearch(int numbers[], int key){
        int first=-1;
        int last=-1;
        for(int i=0; i<numbers.length;i++){
            if (numbers[i]==key){
                if(first==-1)
                {
                    first=i;
                }
                    last=i;
            }
        }
        if(first==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("first occurrence of element is: "+first);
            System.out.println("last occurrence of element is: "+last);
        }
    
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,43};
        int key=5;
        ElementSearch(numbers,key);
    }
}

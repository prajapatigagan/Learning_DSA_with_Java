public class CountOccurrences {
    public static int Count(int numbers[], int key){
        int count =0;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,5,3,8,9};
        int key=3;
        int ans=Count(numbers,key);
        System.out.println("element found "+ans+" times");
    }
}

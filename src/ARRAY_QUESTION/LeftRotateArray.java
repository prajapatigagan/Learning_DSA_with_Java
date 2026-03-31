package ARRAY_QUESTION;

public class LeftRotateArray {
    public static void leftRotate(int num[],int d){
        
        for(int k=0; k<d; k++){
            int first=num[0];
            for(int i=0; i<num.length-1; i++){
                num[i]=num[i+1];
            }
            num[num.length-1]=first;
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int d=3;
        leftRotate(num,d);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }   
}

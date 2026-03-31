package ARRAY_QUESTION;

public class RightRotateArray {
    public static void rightRotate(int num[],int d){
        
        for(int i=0; i<d; i++){
            int last=num[num.length-1];
            for(int j=num.length-1; j>0; j--){
                num[j]=num[j-1];
            }
            num[0]=last;
        }
}
public static void main(String[] args) {
    int num []={1,2,3,4,5};
    int d=2;
    rightRotate(num,d);
    for(int i=0; i<num.length; i++){
        System.out.print(num[i]+" ");
    }
}
}

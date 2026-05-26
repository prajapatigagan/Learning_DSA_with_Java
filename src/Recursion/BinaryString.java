package Recursion;

public class BinaryString {
    public static void Binarystring(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        
           Binarystring(n-1, 0, str+"0");
        if(lastplace==0){     
            Binarystring(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
    Binarystring(3, 0,"");
    }
    
}

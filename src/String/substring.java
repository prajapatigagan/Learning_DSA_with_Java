package String;

public class substring {
    public static void string(String str,int si,int le){
        String substr=" ";
        for(int i=si; i<le; i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        string(str,0,7);
    }
    
}

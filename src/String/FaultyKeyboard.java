package String;

public class FaultyKeyboard {
    public static String finalString(String s){
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='i'){
                ans.reverse();
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="string";
        System.out.println(finalString(s));
    }
}

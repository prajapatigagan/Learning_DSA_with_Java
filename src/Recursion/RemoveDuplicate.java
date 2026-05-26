package Recursion;

public class RemoveDuplicate {
    public static void RemoveDuplicateString(String str, int idx,StringBuilder newString,boolean map[]){
        if(idx==str.length()){
            System.out.println(str);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']=true){
            RemoveDuplicateString(str, idx+1, newString, map);
        }else{
            map[currChar-'a']=true;
            RemoveDuplicateString(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appanacollege";

    }
    
}

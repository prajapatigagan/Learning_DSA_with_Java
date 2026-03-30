public class SearchinString {
    public static boolean Search(String str, char target)
    {
        for(int i=0;i<str.length(); i++){
            int element=str.charAt(i);
            if(element==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="Gagan Prajapati";
        char target ='G';
        boolean ans=Search(str,target);
        System.out.println(ans);
    }
}
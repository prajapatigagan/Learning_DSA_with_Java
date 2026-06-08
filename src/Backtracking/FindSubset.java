package Backtracking;

public class FindSubset {

    // public static void printSubsets(char[] set) {
    //     int n = set.length;

    //     for (int i = 0; i < (1 << n); i++) {
    //         System.out.print("{ ");

    //         for (int j = 0; j < n; j++) {
    //             if ((i & (1 << j)) > 0) {
    //                 System.out.print(set[j] + " ");
    //             }
    //         }

    //         System.out.println("}");
    //     }
    // }

    // public static void main(String[] args) {
    //     char[] set = {'a', 'b', 'c'};
    //     printSubsets(set);
    // }

    public static void printSubsets(String str ,String ans,int i){

        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        printSubsets(str, ans+str.charAt(i),i+1);
        printSubsets(str, ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        printSubsets(str,"",0);
    }
}
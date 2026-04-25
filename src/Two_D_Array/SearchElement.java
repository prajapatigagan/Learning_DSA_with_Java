package Two_D_Array;
import java.util.*;

public class SearchElement {
    public boolean search(int array[][], int target){
        int n=array.length;
        int m=array[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(array[i][j]==target){
                    System.out.println("Element found at index: "+i+","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int array[][]=new int[3][3];
        int n=array.length;
        int m=array[0].length;

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        SearchElement se=new SearchElement();
        se.search(array, 5);
    }
    
    
}

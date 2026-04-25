package Two_D_Array;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; i<m; i++){
                matrix[i][j]=sc.nextInt();
            }
        } 
          for(int i=0; i<n; i++){
            for(int j=0; i<m; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }    
    }
    
}

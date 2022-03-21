package Arrays;

import java.util.*;
public class SpiralMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{5,6,7},{9,10,11}};
    int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int rowStart = 0;
        int colStart = 0;
        
        int rowEnd = m-1;
        int colEnd = n-1;
        
        while(list.size() != m*n) {
            
            for(int col=colStart; col<colEnd; col++) {
              if(list.size() != m*n)
                list.add(matrix[rowStart][col]);
            }
            
            for(int row=rowStart; row<rowEnd; row++) {
              if(list.size() != m*n)
                list.add(matrix[row][colEnd]);
            }
            
            for(int col=colEnd; col>colStart; col--) {
              if(list.size() != m*n)
                list.add(matrix[rowEnd][col]);
            }
            
            for(int row=rowEnd; row>rowStart; row--) {
              if(list.size() != m*n)
                list.add(matrix[row][colStart]);
            }
            
            rowStart++;
            colStart++;
            
            rowEnd--;
            colEnd--;
        }

        System.out.println(list);
  }
}

package Arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] my2DArray = {
                {2,4,6,8},
                {1,3,5,7,9},
                {12,34,56,67,78},
                {11,33}
        };
        int target = 7;
        int[] ans = search(my2DArray, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

package Arrays;

public class MaxInArray {

    public static void main(String[] args){
        int[] myArray = {12,42,11,455,221,4213,212};
        System.out.println(max(myArray));
    }

    // TODO: 28/07/25 Function to find maximum in the array
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

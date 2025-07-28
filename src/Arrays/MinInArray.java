package Arrays;

public class MinInArray {
    public static void main(String[] args){
        int[] myArray = {2,53,21,-23,14,42};
        System.out.println(minInArray(myArray));
    }

//    static void minNumberInArray(int[] arr){
//        for (int i = 0; i<arr.length; i++){
//            int min = arr[i];
//            int newMin = arr[i+1];
//            if(min > newMin){
//                newMin = min;
//            }
//            System.out.println(newMin);
//        }
//    }


//    static int minInArray(int[] arr){
//        int ans = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//            if (arr[i] < ans){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }

    // TODO: 28/07/25 function to find minimum number in the array 
    static int minInArray(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if  (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}

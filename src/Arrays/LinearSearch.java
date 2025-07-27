package Arrays;

// TODO: 27/07/25 STARTED LEARNING ABOUT THE LINEAR SEARCH
public class LinearSearch {

    // TODO: here is my approach to solve
//    public static void main(String[] args) {
//        // Created an array of integer number named as arr
//        int[] arr = {10,12,30,45,75};
//        int find = 45;
//
//        for (int i = 0; i< arr.length; i++){
//            if (arr[i] == find){
//                System.out.println(find + " is at index "+ i);
//            }
//        }
//
//    }


    // TODO: 27/07/25 approach for linear search from youtube video

    public static void main(String[] args) {
        int[] nums = {10,23,34,232,434,22};
        int target = 434;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // TODO:- here i am returning the index of the element through linear search
//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            if (element == target){
//                return i;
//            }
//        }

        // TODO:- here i am returning the element itself rather than the index value
        for (int i = 0; i< arr.length; i++){
            int element = arr[i];
            if (element == target){
                return element;
            }
        }
        return -1;
    }

}


package Arrays.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
//    public static void main(String[] args) {
//        int[] arr = {5,7,7,7,7,8,8,10};
//        int target = 7;
//
//    }
//
//     public int[] searchRange(int[] arr, int target){
//        // TODO: 01/08/25
//        int[] ans = {-1, -1};
//        int start = search(arr,target,true);
//        int end = search(arr,target,false);
//
//        ans[0] = start;
//        ans[1] = end;
//        return ans;
//    }
//
//    int search(int[] arr, int target, boolean findStartIndex){
//        int ans = -1;
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if (target > arr[mid]){
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            }else{
//                ans = mid;
//                if (findStartIndex == true){
//                    end = mid - 1;
//
//                }else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }


    public static void main(String[] args){
        int[] arr = {2,4,6,7,7,7,12,13,14};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] arr = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums , target , false);

        arr[0] = start;
        arr[1] = end;
        return arr;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                ans = mid;
                if (findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}

package Arrays.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11};
        int[] array = {1,2,4,5,6,8,12};
        int target = 8;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}

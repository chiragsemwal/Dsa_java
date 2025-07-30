package Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8};
        int target = 2 ;
        System.out.println(binarySearch(arr, target));
    }

    //return index
    //retrn -1 if doesnt exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
//            int mid = (start + end) / 2;
            // TODO: 30/07/25 betterr approach to find mid
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

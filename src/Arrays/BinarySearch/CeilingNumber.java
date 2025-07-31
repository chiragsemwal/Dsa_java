package Arrays.BinarySearch;

// TODO: 31/07/25 my approach ceilingNumber
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int target = 15;
        System.out.println(searchCeiling(arr,target));
    }

    static int searchCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr.length-1){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return start;
    }
    static int searchFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target < arr.length -1){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}


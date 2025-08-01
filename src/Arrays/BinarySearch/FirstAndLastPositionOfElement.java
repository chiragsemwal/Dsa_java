package Arrays.BinarySearch;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;

    }

     public int[] searchRange(int[] arr, int target){
        // TODO: 01/08/25
        int[] ans = {-1, -1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                ans = mid;
                if (findStartIndex == true){
                    end = mid - 1;

                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

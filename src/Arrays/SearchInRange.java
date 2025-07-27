package Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {22,42,411,56,1,32,54,12};
        int target = 56;
        System.out.println(search(arr, target, 1,4));
    }

    static int search(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i<end; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}

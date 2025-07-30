package Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6}
        };

    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

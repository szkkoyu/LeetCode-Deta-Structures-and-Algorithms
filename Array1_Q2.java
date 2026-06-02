import java.util.Arrays;

public class Array1_Q2 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int harf = n;

        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[harf];
            harf++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Array1_Q2 solver = new Array1_Q2();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = solver.shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}

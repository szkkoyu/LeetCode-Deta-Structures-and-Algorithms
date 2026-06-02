import java.util.Arrays;

class Array2_Q2 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] count = new int [101];
        int [] ans = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for(int i = 0; i < nums.length ; i++) {
            for(int j = 0; j < nums[i]; j++) {
                if(count[j] != 0) {
                    ans[i] += count[j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Array2_Q2 solver = new Array2_Q2();

        int [] nums = {8, 1, 2, 2, 3};
        int [] result = solver.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

}
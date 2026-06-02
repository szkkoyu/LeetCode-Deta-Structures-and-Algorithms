import java.util.Arrays;

public class Array2_Q1 {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        
        for (int i=0;i < nums.length;i++) {
            count[nums[i]]++;
        }

        int duplicate = -1;
        int missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Array2_Q1 solver = new Array2_Q1();
        
        int[] nums = {1, 2, 2, 4};
        
        int[] result = solver.findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
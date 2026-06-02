import java.util.Arrays;

public class Array1_Q1 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int j = 0;
        for(int i = 0 ; i < nums.length * 2 ; i++) {
            if(j == nums.length)
                j = 0; 
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Array1_Q1 solver = new Array1_Q1();

        int[] nums = {1, 2, 1};
        int[] result = solver.getConcatenation(nums);

        System.out.println(Arrays.toString(result)); 
    }
}
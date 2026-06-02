public class Array1_Q3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int continue_count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                counter++;
                if(counter >= continue_count)
                    continue_count = counter;  
            } else {
                counter = 0;
            }
        }

        return continue_count;
    }

    public static void main(String[] args) {
        Array1_Q3 solver = new Array1_Q3();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solver.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
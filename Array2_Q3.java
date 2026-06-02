import java.util.List;
import java.util.ArrayList;

public class Array2_Q3 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < count.length; i++) {
            if(count[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Array2_Q3 solver = new Array2_Q3();

        int [] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solver.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}

import java.util.List;
import java.util.ArrayList;

public class Stack_Q1 {
    public List<String> buildArray(int [] target, int n) {
        List<String> ansList = new ArrayList<>();
        int[] counter = new int[n+1];
        int target_index = 0;
        int lastElement = -1;

        for (int i = 1; i < n + 1; i++) {
            if (target[target_index] == i) {
                counter[i] = 1;
                target_index++;
                lastElement = i;
            } else {
                counter[i] = 0;
            }
            if(target_index == target.length)
                break;

        }
        for(int i = 1; i <= lastElement; i++) {
            if (counter[i] == 1) {
                ansList.add("Push");
            } else {
                ansList.add("Push");
                ansList.add("Pop");
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        Stack_Q1 solver = new Stack_Q1();

        int [] target = {1, 3};
        int n = 3;
        List<String> result = solver.buildArray(target, n);
        System.out.println(result);
    }
}

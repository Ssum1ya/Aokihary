import java.util.Arrays;

public class Test {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 9) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Test zxc = new Test();
        System.out.println(Arrays.toString(zxc.twoSum(new int[] {2, 7, 11, 15}, 9)));

    }
}

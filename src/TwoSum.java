public class TwoSum {
    public int[] twosum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   res[0] = i;
                   res[1] = j;

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum netice = new TwoSum();
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
         netice.twosum(nums1,target1);

    }
}


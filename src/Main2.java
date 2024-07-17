public class Main2 {
    public static void main(String[]args) {
        TwoSum solution = new TwoSum();
        int [] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res = solution.twosum(nums1, target1 );
        System.out.println();
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int [] res2 = solution.twosum(nums2, target2);
        System.out.println();
        int [] nums3 = {3, 3};
        int target3 = 6;
        int [] res3 = solution.twosum(nums3,target3);
        System.out.println();
    }

}

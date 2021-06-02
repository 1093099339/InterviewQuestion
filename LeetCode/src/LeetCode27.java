/**
 * @program: basics
 * @description:
 * @author: 全栈者也
 * @create: 2021 - 04 - 19 11:38
 **/
public class LeetCode27 {


    public static void main(String[] args) {

        int []vars = {3,2,3,2};
        int val = 3;
        removeElement(vars,val);

        System.out.println(vars.toString());
        System.out.println(val);
    }
        public static int removeElement ( int[] nums, int val){
            int n = nums.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
}

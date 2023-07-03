public class Solution2 {
   public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num] += 1;
            if (arr[num] == 2) {
                return num;
            }
        }
        return 0;
    } 
}
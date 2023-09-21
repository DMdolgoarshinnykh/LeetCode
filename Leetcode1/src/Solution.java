class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag = false;
        int[] return2pow = new int[2];
        short i = 0;
        short j = 0;
        while (flag == false) {
            if (nums[i] + nums[j] == target && i!=j) {
                flag = true;
                return2pow[0] = i;
                return2pow[1] = j;
                break;
            }
            if (j < nums.length-1) {
                j++;
            } else {
                if (i < nums.length-1) {
                    j = 0;
                    i++;
                }
            }
        }
    return  return2pow;
    }
}
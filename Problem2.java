/*
Jump Game
approach: try all the paths, which is exhaustive, we can see repeated sub problems then use dp. greedy from right.
time: O(n)
space: O(1)
 */
public class Problem2 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int dest = n-1;

        for (int i=n-2;i>=0;i--) {
            if ((nums[i]+i)>=dest) {
                dest = i;
            }
        }

        if (dest == 0) return true;
        return false;
    }
}

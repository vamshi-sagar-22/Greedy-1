/*
Jump Game ii
approach: exploring all paths will be exhaustive, we can observe that at each index we have to check how close we're getting
to last index by choosing current index
time: O(n)
space: O(1)
 */
public class Problem3 {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int curint = 0, nextint = 0;
        for (int i=0;i<n-1;i++) {
            nextint = Math.max(nums[i]+i, nextint);
            if (i==curint) {
                curint = nextint;
                jumps++;
            }
        }

        return jumps;
    }
}

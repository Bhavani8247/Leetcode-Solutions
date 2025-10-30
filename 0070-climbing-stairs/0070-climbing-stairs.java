class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; // Base cases

        int first = 1;  // ways to reach step 1
        int second = 2; // ways to reach step 2

        // For each next step, the ways = sum of previous two steps
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}

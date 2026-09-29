class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> n = new HashSet();
        for(int i=0;i<nums.length;i++) n.add(nums[i]);

        int m = 0;

        for(int e : n){
            if(!n.contains(e-1)){
                int streak = 0;
                int cur = e;

                while(n.contains(cur)){
                    streak++;
                    cur++;
                }
                m = m > streak ? m : streak;
            }
        }

        return m;
    }
}

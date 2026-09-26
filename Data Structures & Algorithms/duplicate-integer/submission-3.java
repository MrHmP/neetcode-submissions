class Solution {
    public boolean hasDuplicate(int[] nums) {
        
Set<Integer> m = new HashSet<>((int)(nums.length / 0.75f) + 1);
        for(int n : nums){
            if(!m.add(n)) return true;
        }

        return false;

    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> m = new HashSet<>();
        for(int n : nums){
            if(!m.add(n)) return true;
        }

        return false;

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(m.containsKey(n)){
                return new int[]{m.get(n), i};
            }else{
                m.put(target - n, i);
            }
        }

        return new int[]{-1,-1};
    }
}

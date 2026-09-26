class Solution {
    public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> m = new HashMap<>((int) (nums.length / 0.75f) + 1);
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int j = m.getOrDefault(n,-100000);
            if(j != -100000){
                return new int[]{j, i};
            }else{
                m.put(target - n, i);
            }
        }

        return new int[]{-1,-1};
    }
}

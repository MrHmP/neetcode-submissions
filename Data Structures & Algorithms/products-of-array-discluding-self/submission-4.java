class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] pref = new int[nums.length];
        int[] suf = new int[nums.length];

        int p = 1;
        for(int i=0;i<nums.length;i++){
            p = p*nums[i];
            pref[i] = p;
        }
        p=1;
        for(int i=0;i<nums.length;i++){
            p = p*nums[nums.length-i-1];
            suf[nums.length-i-1] = p;
        }

        for(int i=0;i<nums.length;i++){
            int l = i-1 >= 0 ? pref[i-1] : 1;
            int r = i+1 < nums.length ? suf[i+1] : 1;
            result[i] = l*r;
        }

        // [1,2,8,48]
        // [48,48,24,6]
        return result;
    }
}  

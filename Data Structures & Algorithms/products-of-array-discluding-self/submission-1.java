class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int z = 0;
        int zc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) zc++;
        }
        int[] result = new int[nums.length];
        
        if(zc > 1){
            for(int i=0;i<nums.length;i++){
                result[i] = 0;
            }
            return result;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0) {
                if(z == 0) z = 1;
                z*=nums[i];
            }
            p*=nums[i];
        }
        System.out.println("p = %d , z = %d".formatted(p,z));
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i] == 0 ? z : p / nums[i];
        }
        return result;
    }
}  

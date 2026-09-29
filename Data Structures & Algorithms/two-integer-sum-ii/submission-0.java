class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] result = new int[2];

        while(l < r){
            if(target == numbers[l]+numbers[r]){
                result[0] = l + 1;
                result[1] = r + 1;

                return result;
            }

            if(target > numbers[l]+numbers[r]){
                l++;
            }else{
                r--;
            }
        }

        return new int[0];
    }
}

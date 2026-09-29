class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4,-1,-1,0,1,2
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int[] rightArray = new int[nums.length - 1];
            int j = 0, c=0;
            while(j<nums.length){
                if(i != j) {
                    rightArray[c++] = nums[j];
                }
                j++;
            }
            List<int[]> rts = twoSum(rightArray, (nums[i] * -1) );
            for(int[] ts : rts){
                int[] r = new int[]{nums[i], ts[0], ts[1]};
                Arrays.sort(r);
                result.add(List.of(r[0],r[1],r[2]));
            }
        }

        return result.stream().toList();
    }

    private List<int[]> twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        List<int[]> res = new ArrayList<>();

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                if(target == 3) {
                    for(int x : numbers) System.out.print(x+",");
                    System.out.print("( "+numbers[l] + "," + numbers[r]);
                }
                res.add(new int[] { numbers[l] , numbers[r] });
                l++;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}

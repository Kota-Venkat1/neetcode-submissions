class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res=0;
        for(int k:nums)
        set.add(k);
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]) && !set.contains(nums[i]-1)){
            int val=nums[i];
            int count=0;
            while(set.contains(val)){
                val++;
                count++;
            }
            res=Math.max(res,count);
            }
        }
        return res;
    }
}

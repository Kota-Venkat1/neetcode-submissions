class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int presum=1,suffsum=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=presum;
            presum*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=suffsum;
            suffsum*=nums[i];
        }
        return ans;
    }
}  

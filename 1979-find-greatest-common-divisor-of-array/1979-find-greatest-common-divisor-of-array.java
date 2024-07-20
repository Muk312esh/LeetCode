class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length, min=Math.min(nums[0],nums[n-1]),res=1;
        Arrays.sort(nums);
        for(int i=min; i>0; i--){
            if(nums[0]%i==0 && nums[n-1]%i==0){
                res=i;
                break;
            }
        }
        return res;
    }
}
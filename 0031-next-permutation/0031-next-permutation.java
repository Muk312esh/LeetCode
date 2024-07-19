class Solution {
    public void nextPermutation(int[] nums) {
        //optimal solution
        int index=-1,n=nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        
        if(index==-1){
            int i=0,j=n-1;
            while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
            }
        }

        for(int i=n-1; i>=index && index!=-1; i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }

        Arrays.sort(nums,index+1,n);
    }
}
/*leetcode->   75.Sort Colors */

class SortColors { 
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1,t;
        while(j<=k){
            
            if(nums[j]==0)
            { 
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }
            else if(nums[j]==1)
                j++;
            else{
                t=nums[j];
                nums[j]=nums[k];
                nums[k]=t;
                k--;
            }
        }
    }
}
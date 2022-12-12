/*leetcode->   2089. Find Target Indices After Sorting Array */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c=0,f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            c++;
            else if(nums[i]==target)
            f++;
        }
        List<Integer> l=new ArrayList<>();
        while(f!=0)
        {
            f--;
            l.add(c++);
        }
        return l;
    }
}
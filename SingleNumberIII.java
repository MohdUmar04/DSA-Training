/*Leetcode-> 260. Single Number III */

/*Using bit Manipulation*/
class SingleNumber {
    public int[] singleNumber(int[] nums) {
        int s=0;
        for(int i : nums){
            s=s^i;
        }
        int diff=s&(-1*s);
        int x=0;
        for(int i :nums)
        {
            if((i&diff)!=0)
                x^=i;
        }
        return new int[]{x,s^x};
    }
}
/*Using HashMap */
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] a=new int[2];
        int k=0;
        for(Map.Entry<Integer,Integer> z :map.entrySet())
        {
            if(z.getValue()==1)
                a[k++]=z.getKey();
        }
        return a;
    }
}

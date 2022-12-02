/*LeetCode -> 49. Group Anagrams*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map=new HashMap<>();
        int i,j;
        List<List<String>> l=new ArrayList<>();
        for(i=0;i<strs.length;i++)
        {
            char c[]=(strs[i]).toCharArray();
            Arrays.sort(c);
            if(map.containsKey(new String(c))){
            List<String> li1=map.get(new String(c));
            li1.add(strs[i]);
            map.put(new String(c),li1);
            }
            else{
            List<String> li=new ArrayList<>();
            li.add(strs[i]);
            map.put(new String(c),li);
            }

        }
        for(Map.Entry<String,List> z:map.entrySet())
        l.add(z.getValue());
        return l;
    }
}
class Solution {
    public String frequencyCount(String str){
        int []frequency = new int[26];
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i)-'a';
            frequency[ch]++;
        }
        String ans="";
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                char ch=(char)('a'+i);
                ans = ans+ch;
                ans=ans+frequency[i];
            }
        }
        return ans;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map = new HashMap<>();
    if(strs==null || strs.length == 0)
    return new ArrayList<>();
    for(int i=0;i<strs.length;i++){
    String key = frequencyCount(strs[i]);
    if(map.containsKey(key)){
        map.get(key).add(strs[i]);
    }
    else{
        ArrayList<String> list = new ArrayList<>();
        list.add(strs[i]);
        map.put(key,list);
    }
    }
    return new ArrayList<>(map.values());
    }
}

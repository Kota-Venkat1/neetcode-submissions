class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;  
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
            else
            map.put(nums[i],1);
        }
        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> a.second - b.second);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            queue.add(new Pair(entry.getKey(),entry.getValue()));
            if(queue.size()>k)queue.poll();
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=queue.poll().first;
        }
        return ans;
    }
}

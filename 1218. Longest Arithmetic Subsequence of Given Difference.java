class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map=new HashMap<>();

        int max=0;
        for(int i=0;i<arr.length;i++){
            int c=arr[i];
            if(map.containsKey(c-difference)){
               map.put(c, map.get(c - difference) + 1);
            }else{
                map.put(c,1);
            }
            max=Math.max(max,map.get(c));
        }
        return max;
    }
}

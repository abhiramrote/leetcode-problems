class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String [] words=paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]+"," ").split("\\s+");
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i=0;i<banned.length;i++){
            map.remove(banned[i]);
        }
        int max=Integer.MIN_VALUE;
        String ans="";
        for(String s: map.keySet()){
            int p=map.get(s);
            if(p>max){
                ans=s;
                max=p;
            }
        }
        return ans;

    }
}

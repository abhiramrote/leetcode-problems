class Solution {
    public int strStr(String haystack, String needle) {
        
        int pos=haystack.indexOf(needle);
        if(pos==-1)return -1;
        return pos;
    }
}

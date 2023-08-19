class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)return false;
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<len1;i++){
            if(map.containsKey(str1.charAt(i))){
                if(map.get(str1.charAt(i))!=str2.charAt(i))return false;
            }
            else{
                map.put(str1.charAt(i),str2.charAt(i));
            }
            if(map2.containsKey(str2.charAt(i))){
                if(map2.get(str2.charAt(i))!=str1.charAt(i))return false;
            }
            else{
                map2.put(str2.charAt(i),str1.charAt(i));
            }
            
            
            
        }
        return true;
        
        
    }
}

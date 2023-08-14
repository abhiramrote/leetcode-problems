class Solution {
    public boolean isValid(String x) {
       Stack<Character> c =new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='['||ch=='('||ch=='{'){
                c.push(ch);
            }
            else{
                if(c.isEmpty()){
                    return false;
                }
                char a=c.peek();
                if(a=='{'&&ch=='}'
                || a=='('&&ch==')'
                || a=='['&& ch==']'){
                    c.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(c.isEmpty()){
            return true;
        }
        else{
            return false;
        }

            
        
        

    }
}

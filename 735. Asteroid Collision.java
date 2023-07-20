class Solution {
    public int[] asteroidCollision(int[] a) {
        int n=a.length;
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || a[i]>0)st.push(a[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(a[i])) {
                    st.pop();
                } else {
                    if (st.isEmpty() || st.peek() < 0) {
                        st.push(a[i]);
                    }
                }
            }
        }
        int ans[]=new int[st.size()];
        int size=st.size();
        while(!st.isEmpty()){
            ans[--size]=st.pop();
        }
        return ans;
    }
}

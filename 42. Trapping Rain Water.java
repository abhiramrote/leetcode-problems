class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int ans=0;
        int left[] = new int[n];
        left[0]=0;
        int  leftmax=arr[0];
        int []right=new int[n];
        int rightmax=arr[n-1];
        for(int i=1;i<n;i++){
            leftmax = Math.max(leftmax, arr[i - 1]);
            if(leftmax>arr[i]){
                left[i]=leftmax;
            }
            else{
                left[i]=0;
            }
            rightmax=Math.max(rightmax,arr[n-i]);
            if(rightmax>arr[n-i-1]){
                right[n-i-1]=rightmax;
            }
            else{
                right[n-i-1]=0;
            }
        }
         for (int i = 0; i < arr.length; i++) {
            int a = Math.min(left[i], right[i]) - arr[i];
            if (a < 0) {
                ans += 0;
            } else {
                ans += a;
            }
        }
        return ans;
    }
}

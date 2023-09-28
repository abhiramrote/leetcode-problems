class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length-1;
        int k=0;
        for(int num:nums){

            if(num%2==0){
                ans[k]=num;
                k++;
            }
            else{
                ans[n]=num;
                n--;
            }
        }
        return ans;
    }
}

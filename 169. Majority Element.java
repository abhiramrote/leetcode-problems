class Solution {
    public int majorityElement(int[] nums) {
        int votes=0,candidate=-1;
        for(int i=0;i<nums.length;i++){
            if(votes==0){
                candidate=nums[i];
                votes=1;
            }
            else if(nums[i]==candidate)votes++;
            else votes--;
        }
         votes=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]==candidate)
                 votes++;            
         }
         if(votes>(nums.length/2)) return candidate;
         return -1;
                 
             
    }
}

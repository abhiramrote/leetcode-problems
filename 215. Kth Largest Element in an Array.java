class Solution {
    public int findKthLargest(int[] nums, int k) {
    if(nums==null || nums.length==0){
        return 0;
    }
    PriorityQueue<Integer> Pqueue = new PriorityQueue<>();
    for(int i : nums){
        Pqueue.add(i);
        if(Pqueue.size()>k){
            Pqueue.poll();
        }
    }
    return Pqueue.peek();
    }
}

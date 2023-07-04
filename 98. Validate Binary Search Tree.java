class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root,long minVal,long maxVal){
        if(root==null)return true;
        if(root.val>=maxVal || root.val<=minVal)return false;
        return valid(root.left,minVal,root.val) && valid(root.right,root.val,maxVal);
    }
}

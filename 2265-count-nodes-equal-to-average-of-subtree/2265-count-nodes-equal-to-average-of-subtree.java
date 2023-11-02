/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public Boolean checkAvg(TreeNode root){
        int val=root.val;
        int sum=0;
        int count=0;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        TreeNode current;
         while(!stack.empty()){
             current=stack.pop();
             sum+=current.val;
             count++;
            if(current.left!=null)
                stack.push(current.left);
            if(current.right!=null)
                stack.push(current.right);
        }
        
        return (sum/count)==val? true: false; 
    }
    
    public int averageOfSubtree(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        int count=0;
        while(!stack.empty()){
            TreeNode current=stack.pop();
            if(current.left!=null)
                stack.push(current.left);
            if(current.right!=null)
                stack.push(current.right);
             if(checkAvg(current))
                count++;
        }
        return count;
    }
    
    
}
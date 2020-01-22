package edu.rice.algo.main;

public class lc230 {
	
	private int cnt = 0;
	private int val;
	
	public int kthSmallest(TreeNode root, int k) {
		inOrder(root, k);
        return val;
    }
	
	private void inOrder(TreeNode node, int k) {
		if(node == null) return;
		inOrder(node.left, k);
		cnt++;
		if(cnt == k) {
			val = node.val;
			return;
		}
		inOrder(node.right, k);
	}

}

package edu.rice.algo.main;

import java.io.*;
import java.util.*;

class Solution {
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

public class MainClass {
	public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().kthSmallest(root, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}


package swordtoOffer;
/*18题
题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
* */

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-05 16:51
 **/
public class TreeMirror_18 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tn = root.left;
        root.left = root.right;
        root.right = tn;
        Mirror(root.left);
        Mirror(root.right);
    }
}
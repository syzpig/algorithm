package com.syz.algorithm.dataStructure.tree.model;

/**
 * @Author: syz
 * @Description: 二叉树结构
 * @Date: 2022/12/22 16:35
 * @Version: 1.0
 */
public class TreeNode {
    //值
    private int val;
    //左子节点树
    private TreeNode left;
    //右子节点树
    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

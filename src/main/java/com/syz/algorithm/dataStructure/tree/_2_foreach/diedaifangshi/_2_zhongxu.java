package com.syz.algorithm.dataStructure.tree._2_foreach.diedaifangshi;

import com.syz.algorithm.dataStructure.tree.model.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: syz
 * @Description: 中序遍历-迭代方式
 * @Date: 2023/1/12 17:04
 * @Version: 1.0
 *    1
 *   / \
 *  2   3
 * / \ / \
 *7  6 4  5
 *
 *
 *  再看中序遍历，中序遍历是左中右，先访问的是⼆叉树左⼦树的节点，然后⼀层⼀层向下访问，直到到达树左⾯的
 * 最底部，再开始处理节点(也就是在把节点的数值放进res列表中)。在使⽤迭代法写中序遍历，就需要借⽤指针的遍
 * 历来帮助访问节点，
 */
public class _2_zhongxu {
    public static void main(String[] args) {
        //中序的结果：  7261435
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        TreeNode treeNode5=new TreeNode(5);
        TreeNode treeNode6=new TreeNode(6);
        TreeNode treeNode7=new TreeNode(7);
        treeNode1.setLeft(treeNode2);
        treeNode2.setRight(treeNode6);
        treeNode2.setLeft(treeNode7);
        treeNode1.setRight(treeNode3);
        treeNode3.setLeft(treeNode4);
        treeNode3.setRight(treeNode5);
        List<Integer> list=new ArrayList<>();
        foreach(treeNode1,list);
        System.out.println("===:"+ list.toString());
    }

    public static void foreach(TreeNode root , List<Integer> list){

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }
            root = stack.pop();
            list.add(root.getVal());
            root = root.getRight();
        }

    }
}

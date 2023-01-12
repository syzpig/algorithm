package com.syz.algorithm.dataStructure.tree._2_foreach.diguifangshi;

import com.syz.algorithm.dataStructure.tree.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: syz
 * @Description: 中序遍历-递归方式
 * @Date: 2023/1/12 17:04
 * @Version: 1.0
 *   1
 *  / \
 *  2  3
 *  \ / \
 *  6 4  5
 */
public class _2_zhongxu {
    public static void main(String[] args) {
        //前序的结果：  261435
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        TreeNode treeNode5=new TreeNode(5);
        TreeNode treeNode6=new TreeNode(6);
        treeNode1.setLeft(treeNode2);
        treeNode2.setRight(treeNode6);
        treeNode1.setRight(treeNode3);
        treeNode3.setLeft(treeNode4);
        treeNode3.setRight(treeNode5);
        List<Integer> list=new ArrayList<>();
        foreach(treeNode1,list);
        System.out.println("===:"+ list.toString());
    }

    public static void foreach(TreeNode node , List<Integer> list){
        if(node==null){
            return;
        }
        foreach(node.getLeft(),list);
        list.add(node.getVal());
        foreach(node.getRight(),list);
    }
}

package com.syz.algorithm.dataStructure.tree._1_level._2_levelForeach;

import com.syz.algorithm.dataStructure.tree.model.TreeNode;

import java.util.LinkedList;

/**
 * @Author: syz
 * @Description: ⼆叉树的层序遍历
 *LeetCode102 题⽬要求：给你⼀个⼆叉树，请你返回其按层序遍历得到的节点值。(即逐层地，从左到右访问所有
 * 节点)。
 *示例1：
 * ⼆叉树：[3,9,20,null,null,15,7],
 *  3
 *  / \
 *  9 20
 *  / \
 *  15 7
 * 返回其层序遍历结果：
 *  [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
 *
 * @Date: 2022/12/22 17:39
 * @Version: 1.0
 */
public class LevelForeach {

    public static void main(String[] args) {

        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode9=new TreeNode(9);
        TreeNode treeNode20=new TreeNode(20);
        TreeNode treeNode15=new TreeNode(15);
        TreeNode treeNode7=new TreeNode(7);
        treeNode3.setLeft(treeNode9);
        treeNode3.setRight(treeNode20);
        treeNode20.setLeft(treeNode15);
        treeNode20.setRight(treeNode7);
        LinkedList<LinkedList<Integer>> valList =  levelForeach(treeNode3);
        valList.forEach(val->{
            System.out.println(val);
        });
    }

    public static LinkedList<LinkedList<Integer>> levelForeach(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        LinkedList<LinkedList<Integer>> valArrList = new LinkedList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        //将根节点放⼊队列中，然后不断遍历队列
        linkedList.add(treeNode);
        while (linkedList.size() > 0) {
            //获取当前队列的⻓度，也就是当前这⼀层的元素个数
            int size = linkedList.size();
            LinkedList<Integer> valList = new LinkedList<>();
            //将队列中的元素都拿出来(也就是获取这⼀层的节点)，放到临时list中
            //如果节点的左/右⼦树不为空，也放⼊队列中
            for (int i = 0; i < size; ++i) {
                TreeNode node = linkedList.remove();
                valList.add(node.getVal());
                if (node.getLeft() != null) {
                    linkedList.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    linkedList.add(node.getRight());
                }
            }
            valArrList.add(valList);
        }
        return valArrList;
    }
}

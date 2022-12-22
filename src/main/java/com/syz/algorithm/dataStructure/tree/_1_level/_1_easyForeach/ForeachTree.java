package com.syz.algorithm.dataStructure.tree._1_level._1_easyForeach;

import com.syz.algorithm.dataStructure.tree.model.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: syz
 * @Description: 层次遍历打印树所有元素
 *
 *  树结构如下
 *   3
 *  / \
 *  9 20
 *    / \
 *   15 7
 *  应输出结果 [3, 9, 20, 15, 7]
 *  思路：先访问根节点，然后将其左右⼦孩⼦放到队列⾥，接着继续出
 * 队，出来的元素都将其左右子孩⼦放到队列⾥，直到队列为空了就退出就⾏了
 * @Date: 2022/12/22 16:38
 * @Version: 1.0
 */
public class ForeachTree {

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
        LinkedList<Integer> valList =  forrachTree(treeNode3);
        valList.forEach(val->{
            System.out.println(val);
        });
    }

    public static LinkedList<Integer> forrachTree(TreeNode treeNode){
        if(treeNode ==null){
            return null;
        }
        LinkedList<Integer> valList=new LinkedList<>();
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        //将根节点放⼊队列中，然后不断遍历队列
        linkedList.add(treeNode);
        //有多少元素执⾏多少次
        while (linkedList.size()>0){
            //获取当前队列的⻓度，这个⻓度相当于 当前这⼀层的节点个数
            TreeNode node=linkedList.remove();//检索并删除列表的头(第一个元素)。 返回这个列表的头
            valList.add(node.getVal());
            if(node.getLeft()!=null){
                linkedList.add(node.getLeft());
            }
            if(node.getRight()!=null){
                linkedList.add(node.getRight());
            }
        }
        return valList;
    }
}

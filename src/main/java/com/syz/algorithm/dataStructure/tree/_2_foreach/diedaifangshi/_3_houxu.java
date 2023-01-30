package com.syz.algorithm.dataStructure.tree._2_foreach.diedaifangshi;

import com.syz.algorithm.dataStructure.tree.model.TreeNode;

import java.util.*;

/**
 * @Author: syz
 * @Description: 后序遍历-迭代方式
 * @Date: 2023/1/12 17:04
 * @Version: 1.0
 *
 *   1
 *  / \
 *  2  3
 * / \ / \
 *7  6 4  5
 *
 *  后序遍历的⾮递归实现有三种基本的思路：反转法、访问标记法、和Morris法，可惜三种理解起来都有些难度，如
 * 果头发不够，可以先将后⾯的学完最后再看本⼩节。其中Morris法是⼀个⽼外发明的巧妙思想：不使⽤栈，⽽是⽤
 * 好树中的null指针。但是实现后序仍然⾮常麻烦，我们这⾥不再展开，感兴趣的同学可以查⼀下，我们这⾥只介绍
 * ⼀种：反转法
 *
 * 前序遍历⼏乎⼀致，前序是先中间，再左边然后右边，⽽这⾥是先中间，再
 * 后边然后左边。那我们完全可以改造⼀下前序遍历，得到序列new_seq之后再reverse⼀下就是想要的结果了，代
 * 码如下
 */
public class _3_houxu {

        public static void main(String[] args) {
            //中序的结果：  7, 6, 2, 4, 5, 3, 1
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

        public static void foreach(TreeNode root , List<Integer> res){

            if (root == null) return;
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;
            while (!stack.isEmpty() || node != null) {
                while (node != null) {
                    res.add(node.getVal());
                    stack.push(node);
                    node = node.getRight();
                }
                node = stack.pop();
                node = node.getLeft();
            }
            Collections.reverse(res);

        }
}

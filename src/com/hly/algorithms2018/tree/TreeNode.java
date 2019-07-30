package com.hly.algorithms2018.tree;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/28
 * @QQ :1136513099
 * @desc :
 */
public class TreeNode<AnyType> {

    //节点数据
    public AnyType data;
    //左子树
    public TreeNode<AnyType> lChild, rChild;

    public TreeNode() {
        this(null);
    }

    public TreeNode(AnyType data) {
        this(data, null, null);
    }

    public TreeNode(AnyType data, TreeNode<AnyType> lChild, TreeNode<AnyType> rChild) {
        this.data = data;
        this.lChild = lChild;
        this.rChild = rChild;
    }
}
package com.company;

public class TreeNode {

    private TreeNode leftChild = null, rightChild = null;
    private int val;

    public TreeNode(int val) {
        this.val = val;
    }

    // Getter
    public int getVal() {
        return val;
    }

    /*
     * Adding Children Nodes
     */
    public void addLeftChild(int val){
        TreeNode left = new TreeNode(val);
        this.leftChild = left;
    }

    public void addRightChild(int val){
        TreeNode right = new TreeNode(val);
        this.rightChild = right;
    }

    public void insertSorted(int val){
        TreeNode ins = new TreeNode(val);
        TreeNode current = this;

        // Traverse down the tree through full nodes
        while(current.leftChild != null || current.rightChild != null) {
            current = val < current.val ? this.leftChild: this.rightChild;
        }


    }


}

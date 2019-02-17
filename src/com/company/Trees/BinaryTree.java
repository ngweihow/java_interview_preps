package com.company.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node root;

    // Constructors
    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(Node node) {
        this.root = node;
    }



    // Inserting a single node in in sorted order
    public void insertNode(Node root, Node node) {

        if(root == null) {
            root = node;
            return;
        }

        // Move left if node is less than root
        if(node.getData() < this.root.getData()) {
            insertNode(root.getLeft(), node);
        }

        else{
            insertNode(root.getRight(), node);
        }
    }

    // Populate the Tree
    public void buildTree(BinaryTree binaryTree, List<Integer> data) {

        // Converting the List of Integers to Nodes
        for(Integer integer: data) {
            insertNode(binaryTree.root, new Node(integer));
        }
    }

    // Search the tree for the Integer
    // Returns null if missing
    public Node searchForNode(Node root, int query) {

        if(root == null) {
            return null;
        }

        // Else if root is present
        else{

            if(root.getData() == query) {
                return root;
            }
            else if(query < root.getData()) {
                searchForNode(root.getLeft(), query);
            }
            else if(query >= root.getData()) {
                searchForNode(root.getRight(), query);
            }
            else {
                return null;
            }
        }

        return null;
    }

    // Element of search
    public boolean search(Node root, int query) {
        if(searchForNode(root, query) != null){
            return true;
        }
        else {
            return false;
        }
    }
}

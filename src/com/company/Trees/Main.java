package com.company.Trees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int LIST_MAX = 10;

    public static void main(String args[]){

        BinaryTree tree1 = new BinaryTree();
        List<Integer> tree1Content= new ArrayList<>();
        for(int i=0;i<LIST_MAX;i++) {
            tree1Content.add(i);
        }
        tree1.buildTree(tree1, tree1Content);
    }
}

package com.vc;

public class Binarysearchtreeimplementation {
	    class Node {
	        int data;
	        Node left, right;
	        Node(int data) {
	            this.data = data;
	            left = right = null;
	        }
	    }

	    Node root;

	    // Insert a node
	    public Node insert(Node root, int data) {
	        if (root == null) return new Node(data);
	        if (data < root.data) root.left = insert(root.left, data);
	        else if (data > root.data) root.right = insert(root.right, data);
	        return root;
	    }

	    public void inorder(Node root) {
	        if (root != null) {
	            inorder(root.left);
	            System.out.print(root.data + " ");
	            inorder(root.right);
	        }
	    }

	    public static void main(String[] args) {
	    	Binarysearchtreeimplementation bst = new Binarysearchtreeimplementation();
	        bst.root = bst.insert(bst.root, 50);
	        bst.insert(bst.root, 30);
	        bst.insert(bst.root, 70);
	        bst.insert(bst.root, 20);
	        bst.insert(bst.root, 40);
	        bst.insert(bst.root, 60);
	        bst.insert(bst.root, 80);

	        System.out.print("Inorder Traversal: ");
	        bst.inorder(bst.root);
	    }
	}



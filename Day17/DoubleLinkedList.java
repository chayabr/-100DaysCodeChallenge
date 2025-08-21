package com.vc;

public class DoubleLinkedList {
	    class Node {
	        int data;
	        Node prev, next;
	        Node(int data) {
	            this.data = data;
	            prev = next = null;
	        }
	    }

	    Node head;

	    // Insert at end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) temp = temp.next;
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    // Display forward
	    public void displayForward() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    // Display backward
	    public void displayBackward() {
	        Node temp = head;
	        if (temp == null) return;
	        while (temp.next != null) temp = temp.next;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.prev;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        DoubleLinkedList list = new DoubleLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.displayForward();
	        list.displayBackward();
	    }
	}


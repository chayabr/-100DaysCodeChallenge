package com.vc;

public class QueueImplementationusingLinkedList {
	    private class Node {
	        int data;
	        Node next;
	    }

	    private Node front, rear;

	    // Enqueue
	    public void enqueue(int x) {
	        Node newNode = new Node();
	        newNode.data = x;
	        if (rear == null) {
	            front = rear = newNode;
	            System.out.println(x + " enqueued to queue");
	            return;
	        }
	        rear.next = newNode;
	        rear = newNode;
	        System.out.println(x + " enqueued to queue");
	    }

	    // Dequeue
	    public int dequeue() {
	        if (front == null) {
	            System.out.println("Queue Underflow");
	            return -1;
	        }
	        int dequeued = front.data;
	        front = front.next;
	        if (front == null) rear = null;
	        return dequeued;
	    }

	    // Peek front element
	    public int peek() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return -1;
	        }
	        return front.data;
	    }

	    // Display queue
	    public void display() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        Node temp = front;
	        System.out.print("Queue: ");
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	QueueImplementationusingLinkedList queue = new QueueImplementationusingLinkedList();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.display();
	        System.out.println("Front element is: " + queue.peek());
	        System.out.println("Dequeued element: " + queue.dequeue());
	        queue.display();
	    }
	}

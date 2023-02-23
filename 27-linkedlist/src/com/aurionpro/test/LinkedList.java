package com.aurionpro.test;

public class LinkedList {

	Node head;

	class Node { // nodecreation
		int data;
		Node next;

		Node(int d) { // constructor
			data = d;
			next = null;
		}
	}

	public void insertAtBeginning(int new_data) { // insertatstart
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void insertAtEnd(int new_data) { // insertatend
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}

	void deleteNode(int position) { // Deletenode
		if (head == null)
			return;

		Node temp = head;

		if (position == 0) {
			head = temp.next;
			return;
		}

		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;

		if (temp == null || temp.next == null)
			return;

		Node next = temp.next.next;

		temp.next = next;
	}

	boolean search(Node head, int key) { // Searchnode
		Node current = head;
		while (current != null) {
			if (current.data == key)
				return true;
			current = current.next;
		}
		return false;
	}

	public void display() { // display
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insertAtEnd(1);
		list.insertAtBeginning(2);
		list.insertAtBeginning(3);
		list.insertAtEnd(4);
		list.insertAfter(list.head.next, 5);

		System.out.println("Linked list: ");
		list.display();

		System.out.println("\nAfter deleting an element: ");
		list.deleteNode(3);
		list.display();

		System.out.println("");
		System.out.println("search a node");
		int search = 3;
		if (list.search(list.head, search))
			System.out.println(search + " is found");
		else
			System.out.println(search + " is not found");

	}
}

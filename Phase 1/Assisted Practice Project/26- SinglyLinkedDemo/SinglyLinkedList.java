package SinglyLinkedDemo;

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(4);
		list.add(6);
		
		list.display();

	}

}

class Node {
	int data;
	Node address;
}

class MyLinkedList {
	Node head = null;
	Node tail = null;
	
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.address = null;
		
		// This condition only executes when the list is empty.
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.address = node;
			tail = node;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			System.out.println(temp);
			System.out.println(temp.address);
			System.out.println("...............");
			temp = temp.address;
		}
	}
}

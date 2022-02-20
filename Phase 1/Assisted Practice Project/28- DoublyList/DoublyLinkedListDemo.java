package DoublyList;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.display();
		list.add(10);
		
		list.display();


	}

}
class Node {
	Node previousAddress;
	int data;
	Node nextAddress;
}
class DoublyLinkedList {
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void add(int value) {
		Node node = new Node();
		node.data = value;
		node.previousAddress = null;
		node.nextAddress = null;
		
		// This condition only executes when the list is empty.
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextAddress = node;
			node.previousAddress = tail;
			tail = node;
		}
	}
	public void display() {
		Node temp = head;
		while(temp!= null) {
			System.out.println(temp.data);
			System.out.println(temp);
			System.out.println(temp.nextAddress);
			System.out.println("...............");
			temp = temp.nextAddress;
		}
	}
}


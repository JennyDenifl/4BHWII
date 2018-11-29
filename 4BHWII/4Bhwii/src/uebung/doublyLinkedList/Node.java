package uebung.doublyLinkedList;

import uebung.linkedList.Node1;

public class Node<T> {
	private Node next = null;
	private Node prev = null;
	T o;
	
	public Node(T o){
		this.o = o;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}

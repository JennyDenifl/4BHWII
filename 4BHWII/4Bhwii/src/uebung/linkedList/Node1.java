package uebung.linkedList;

public class Node1<T> {
	private Node1 next = null;
	//private int value;
	T o;
	
	public Node1(T o){
		this.o = o;
	}
	
	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
}

package uebung.doublyLinkedList;

import uebung.linkedList.Node1;

public class DoublyLinkedList<T> {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	
	public void add(T o){
		Node n = new Node(o);
		// if list is empty point to first element
		if(head == null){
			head = n;//set und get können nie von null aufgrufen werden
			tail = head;
		}else{
			Node tmp= head;
			while(tmp.getNext() != null){
				tmp= tmp.getNext();
				tail = tmp;
			}
		size++;
		tmp.setNext(n);
		}
	}
	
	public Object getValueFor(int index){
		Node tmp= head;
		for(int i = 0; i <index; i++){
			if(tmp.getNext() == null){
				//throw new IndexOutOfBoundsException();
			}else{
				tmp = tmp.getNext();
			}
			
		}
		return tmp.getO();
	}
	
	
	public void remove(int index){
		Node tmp = head;
	    if (index == 0) {
	        head = head.getNext();
	    }else {
	        for (int i = 1; i < index-1; i++){
	            tmp = tmp.getNext();
	        }

	        tmp.setNext(tmp.getNext().getNext());
	    }
	    if(index == 10){
			tail = tail.getPrev();
		}

	    this.size--;
	}
	
	
	
	public int getSize(int i) {
		return size;
	}

	
}

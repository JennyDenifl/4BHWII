package test;

import static org.junit.Assert.*;

import uebung.doublyLinkedList.DoublyLinkedList;
import uebung.linkedList.SingleLinkedList;

public class Test {

	//@org.junit.Test
	public void addSl() {
		SingleLinkedList l1 = new SingleLinkedList();
		l1.add(1);
		l1.add(2);
		
		assertEquals(l1.getValueFor(0), 1);
		assertEquals(l1.getValueFor(1),2);
		assertEquals(l1.getSize(0), 1);
	}
	
	
	@org.junit.Test
	public void addDl(){
		DoublyLinkedList<Integer> dl= new DoublyLinkedList();
		dl.add(1);
		dl.add(2);
		assertEquals(dl.getValueFor(0), 1);
		assertEquals(dl.getValueFor(1), 2);
		assertEquals(dl.getSize(0), 1);
	}
	
	@org.junit.Test
	public void removeFirstDl(){
		DoublyLinkedList<Integer> dl= new DoublyLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.remove(0);
		assertEquals(dl.getValueFor(0), 2);
	}
	
	@org.junit.Test
	public void removeDl(){
		DoublyLinkedList<Integer> dl= new DoublyLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.remove(1);
		assertEquals(dl.getValueFor(0), 1);
		assertEquals(dl.getValueFor(1), 3);
		assertEquals(dl.getValueFor(2), 4);
	}
	
	@org.junit.Test
	public void removeLastDl(){
		DoublyLinkedList<Integer> dl= new DoublyLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.remove(4);
		assertEquals(dl.getValueFor(0), 1);
		assertEquals(dl.getValueFor(1), 2);
		assertEquals(dl.getValueFor(2), 3);
		assertNotEquals(dl.getValueFor(3), 4);
	}

}

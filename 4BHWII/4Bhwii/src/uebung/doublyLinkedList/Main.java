package uebung.doublyLinkedList;

import uebung.doublyLinkedList.DoublyLinkedList;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> dl= new DoublyLinkedList();
		for(int i = 0; i <= 10; i ++){
			dl.add(i);
		}
		dl.remove(0);
		for(int i = 0; i < 10; i++){
			System.out.println(dl.getValueFor(i));
		}
		System.out.println("Size:" + dl.getSize(10));
	}
}

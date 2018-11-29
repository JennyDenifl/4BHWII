package uebung.linkedList;

public class Main {
	public static void main(String[] args) {
		SingleLinkedList ll = new SingleLinkedList();
		for(int i = 0; i < 10; i ++){
			ll.add(i);
		}
		ll.remove(6);
		
		for(int i = 0; i < 9; i++){
			System.out.println(ll.getValueFor(i));
		}
		System.out.println("Size:" + ll.getSize(10));
		
		System.out.println();
		
		SingleLinkedList1<String> l1= new SingleLinkedList1();
		for(int i = 0; i < 10; i ++){
			l1.add("Hello " +i);
		}
		l1.remove(6);
		
		for(int i = 0; i < 9; i++){
			System.out.println(l1.getValueFor(i));
		}
		System.out.println("Size:" + l1.getSize(10));
	}
}

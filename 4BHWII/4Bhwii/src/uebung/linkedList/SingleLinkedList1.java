package uebung.linkedList;

public class SingleLinkedList1<T> {

	private Node1 head = null;
	private int size = 0;
	
	public void add(T o){
		Node1 n = new Node1(o);
		// if list is empty point to first element
		if(head == null){
			head = n;//set und get können nie von null aufgrufen werden
			size++;
		}else{
			Node1 tmp= head;
			while(tmp.getNext() != null){
				tmp= tmp.getNext();
				size++;
			}
			tmp.setNext(n);
		}
	}
	
	public Object getValueFor( int index){
		Node1 tmp= head;
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
		Node1 tmp = head;
		
	    if (index == 0) {
	        head = head.getNext();
	    }else {
	        for (int i = 1; i < index-1; i++){
	            tmp = tmp.getNext();
	        }

	        tmp.setNext(tmp.getNext().getNext());
	    }
	    if(index == 10){
			tmp.setNext(tmp);
		}

	    this.size--;
	}
	
	public int size() {
	    return this.size;
	}

	/*	if(index == 0){
			head.setNext(head.getNext());
		}
		
		if(0 < index && index < 10){
		for(int i = 0; i < index-1;i++){
			while(tmp.getNext() != null){
			tmp = tmp.getNext();
			}
			tmp.setNext(tmp.getNext().getNext());
		}
		}
		
		
		if(index == 10){
			tmp.setNext(tmp);
		}
	}*/

	

	//funktioniert nicht
	public Object getValue(int index) {
		Node1 tmp= head;
		int i = 0;
		while(tmp.getNext() != null){
			tmp= tmp.getNext();
			if(i== index){
				return tmp.getO();
			}
			tmp = tmp.getNext();
			i++;
		}
		return -1;
	}

	
	public int getSize(int index) {
		return 9;
	}
	
}

package uebung.linkedList;
//remove, getSize, <T>
public class SingleLinkedList {
	
	private Node head = null;
	private int size = 0;
	
	public void add(int value){
		Node n = new Node(value);
		// if list is empty point to first element
		if(head == null){
			head = n;//set und get können nie von null aufgrufen werden
			size++;
		}else{
			Node tmp= head;
			while(tmp.getNext() != null){
				tmp= tmp.getNext();
				size++;
			}
			tmp.setNext(n);
		}
	}
	
	public int getValueFor(int index){
		Node tmp= head;
		for(int i = 0; i <index; i++){
			if(tmp.getNext() == null){
				//throw new IndexOutOfBoundsException();
			}else{
				tmp = tmp.getNext();
			}
			
		}
		return tmp.getValue();
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
			tmp.setNext(tmp);
		}

	    this.size--;
	}
	
	
	
	

	/*funktioniert nicht
	public int getValue(int index) {
		Node tmp= head;
		int i = 0;
		while(tmp.getNext() != null){
			tmp= tmp.getNext();
			if(i== index){
				return tmp.getValue();
			}
			tmp = tmp.getNext();
			i++;
		}
		return -1;
	}*/

	public int getSize(int index) {
		// TODO Auto-generated method stub
		return size;
	}

		
}

package uebung.tree;

import uebung.tree.Node;

public class Binarytrees {

	Node head = null;
	//int sizeLinks = 0;
	//int sizeRechts = 0;
	
	
	public void add(int value){
		Node n = new Node(value);
		
		if(head == null){
			head = n;
			
		}else{
			Node tmp = head;
			
			while(tmp.getLinks() != null && n == tmp && n.getValue() <= tmp.getValue()){
				tmp =  tmp.getLinks();
				
			}
			while(tmp.getRechts() != null && n == tmp && n.getValue() > tmp.getValue()){
				tmp = tmp.getRechts();
				
			}
		}
	}
	
	
	public void remove(int value){
		Node tmp= head;
		Node n = new Node(value);
		
		if(tmp == n){
			while(n.getLinks() < n.setLinks(getLinks().getLinks()))
			tmp = n.getLinks();
		}
		
		if(tmp != n && n.getLinks() != null && n.getRechts() != null){
			
		}
		
		if(tmp != n && n.getLinks() != null && n.getRechts() == null){
			
		}
		
		if(tmp != n && n.getRechts() != null && n.getLinks() == null){
			
		}
		
		if(n.getLinks() == null && n.getLinks() == null){
			n = null;
		}
		
	}
	
	
	public Object getValue(int value){
		Node tmp = head;
		Node n = new Node(value);
		for(int i = 0; tmp != n; i++){
			if(tmp.getLinks() == null){
				//throw new IndexOutOfBoundsException();
			}else{
				tmp = tmp.getLinks();
			}
			
			if(tmp.getRechts() == null){
				//throw new IndexOutOfBoundsException();
			}else{
				tmp = tmp.getRechts();
			}	
		}
		return tmp.getValue();
	}
	
	
	
	/*public int getSizeLinks(int i) {
		return sizeLinks;
	}
	
	public int getSizeRechts(int i) {
		return sizeRechts;
	}*/
}

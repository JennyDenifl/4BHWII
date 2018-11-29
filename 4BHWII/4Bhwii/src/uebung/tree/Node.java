package uebung.tree;

public class Node {
	private Node links = null;
	private Node rechts = null;
	private int value;
	
	
	public Node(int value){
		this.value = value;
	}
	
	public Node getLinks() {
		return links;
	}
	
	public void setLinks(Node links) {
		this.links = links;
	}
	
	public Node getRechts() {
		return rechts;
	}
	public void setRechts(Node rechts) {
		this.rechts = rechts;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
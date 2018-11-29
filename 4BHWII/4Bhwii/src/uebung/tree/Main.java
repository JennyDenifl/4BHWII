package uebung.tree;

public class Main {

	public static void main(String[] args) {
		Binarytrees bt = new Binarytrees();
		for(int i = 0; i < 10; i ++){
			bt.add(i);
		}
		for(int i = 0; i < 9; i++){
			System.out.println(bt.getValue(i));
		}
	}

}

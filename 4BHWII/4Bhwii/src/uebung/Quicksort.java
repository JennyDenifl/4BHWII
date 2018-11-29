package uebung;

import java.util.ArrayList;

public class Quicksort { 
	
	static ArrayList<Integer> l = new ArrayList<Integer>();
	static ArrayList<Integer> l1 = new ArrayList<Integer>();
	static ArrayList<Integer> l2 = new ArrayList<Integer>();
	static ArrayList<Integer> l3 = new ArrayList<Integer>();
	
	public static int Qs(ArrayList<Integer> l4){

		l.add(3);
		l.add(5);
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(7);
			
		l2.add(l.get(0));
	
		if(l.size() <= 1){
			return 1;
		}
			
		for(int i = 1; i < l.size(); i++){
			if(l2.get(0) > l.get(i)){
				l1.add(l.get(i));
			}
			
			if(l2.get(0) < l.get(i)){
				l3.add(l.get(i));
			}	
		}
		return Qs(l1) + Qs(l3);
	}

	
	public static void main(String[] args) { 
		
		System.out.println(Qs(l));
		System.out.println(Qs(l1));
		System.out.println(Qs(l2));
		System.out.println(Qs(l3));	
	}
	
}

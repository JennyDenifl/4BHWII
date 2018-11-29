package uebung.person;

import java.util.ArrayList;

import uebung.person_interface.Object;
import uebung.person_interface.Haus;
import uebung.person_interface.IBiggerThan;

public class Person_main {

	public static void main(String[] args) {
		/*ArrayList<Person> p = new ArrayList<>();
		p.add(new Person("Martin", "Guns" ,26));
		p.add(new Person("Lucy", "Hau", 30 ));
		*/
		
		ArrayList<IBiggerThan> l= new ArrayList<>();
		l.add(new Object("Martin", "Guns" ,26));
		l.add(new Object("Martin", "Hau" ,26));
		l.add(new Haus());
		sort(l);
		
	}
	private static void sort(ArrayList<IBiggerThan> l){
		for(int i = 0; i < l.size()-1; i++){
			if(l.get(0).isBiggerThan(l.get(1))){
				System.out.println( "is bigger than");
			}else{
				System.out.println("is smaller than");
			}
		}
		
	}
}

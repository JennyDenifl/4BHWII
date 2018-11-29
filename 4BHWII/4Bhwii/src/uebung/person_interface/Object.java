package uebung.person_interface;
import java.util.ArrayList;

import uebung.person.Person;


public class Object implements IBiggerThan<Person> {
	private String firstname;
	private String lastname;
	private int age;

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Object(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age  = age;
	}

	public boolean isBiggerThan(Person o){
		Person p =(Person) o;
		int shortestNameLength = 0;
		if(this.lastname.length() < p.getLastname().length()){
			shortestNameLength = this.lastname.length();
		}else{
			shortestNameLength = p.getLastname().length();
		}
		for(int i = 0; i< shortestNameLength; i++){
			if( this.lastname.charAt(i) > p.getLastname().charAt(i)){
				return true;
			}else if(this.lastname.charAt(i) < p.getLastname().charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Person> p = new ArrayList<>();
		p.add(new Person("Martin", "Zöller" ,26));
		p.add(new Person("Lucy", "Hau", 30 ));
		
		if(p.get(0).isBiggerThan(p.get(1))){
			System.out.println( "is bigger than");
		}else{
			System.out.println("is smaller than");
		}
	}

}

package uebung.person;

public class Person {
		
	private String firstname;
	private String lastname;
	private int age;
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age  = age;
	}
	
	public boolean isBiggerThan(Person p){
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

	public boolean isSmallerThan(Person p){
		int longestNameLength = 0;
		if(this.lastname.length() > p.getLastname().length()){
			longestNameLength = this.lastname.length();
		}else{
			longestNameLength = p.getLastname().length();
		}
		for(int i = 0; i < longestNameLength; i++){
			if( this.lastname.charAt(i) < p.getLastname().charAt(i)){
				return true;
			}else if(this.lastname.charAt(i) > p.getLastname().charAt(i)){
				return false;
			}
		}
		return true;
	}		
}

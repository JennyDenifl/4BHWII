package uebung.person_interface;

import uebung.person.Person;

public interface IBiggerThan<T> {
	
	//boolean isBiggerThan(IBiggerThan o);
	public boolean isBiggerThan(T o);
	
}

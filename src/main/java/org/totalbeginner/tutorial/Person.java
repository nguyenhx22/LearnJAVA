package org.totalbeginner.tutorial;

import javax.print.DocFlavor.STRING;

public class Person {
	//fields
	private String name;
	private int maximumBooks;
	
	//constructor
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	public String toString() {
		return this.getName() + " ("+ this.getMaximumBooks() + " books)";
		
	};
	
	
	///* ---- To test --------------------

	public static void main(String[] args) {
		//Declare and Instantiate person
		Person person = new Person();
		String l_var = "no match";
		
		person.setName("dan");
						
		if (person.name.equalsIgnoreCase("Dan")) {
			l_var = "match for Dan";
		}
		
		System.out.println(person.name);
		System.out.println(l_var);
	}
	
	//-----------------------------------*/
}

package org.totalbeginner.tutorial;

public class Book {

	public String title;
	public String author;

	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}

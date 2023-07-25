package org.tnsif.classandobject;

public class Library {
	public long noOfBooks;
	public String address;
	
	public Library() {
		
	}
	
	public Library(long noOfBooks, String address) {
		this.noOfBooks = noOfBooks;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", address=" + address + "]";
	}
}

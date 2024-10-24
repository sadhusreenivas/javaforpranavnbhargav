package oop;

public class Address {
	
	private int hno;
	private String street;
	private String city;
	private int pin;
	
	public Address(int hno, String street, String city, int pin) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return hno+" "+street+" "+city+" "+pin;
	}
	
	

}

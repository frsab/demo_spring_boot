package com.example.models;
import org.springframework.data.annotation.Id;


public class Customer {

    @Id
    public String id;

    public String firstName;
	public String lastName;
    public String square;
    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



    public Customer() {}

    public Customer(String firstName, String lastName,String square) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.square=square;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s, square='%s']",
                id, firstName, lastName,square);
    }

	public String getSquare() {
		return square;
	}

	public void setSquare(String square) {
		this.square = square;
	}

}
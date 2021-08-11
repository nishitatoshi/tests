package com.techment.question3;

@SuppressWarnings("serial")
class nameLengthException extends Exception{  
	 nameLengthException(String s){  
	  super(s);  
	 }  
	} 

public class Employeee {

	private  String firstName;
	private String lastName;
	
	public Employeee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	static void validateEntry(String firstName, String lastName )throws NullPointerException{  
	     if((firstName.trim().length()==0) && (lastName.trim().length()==0)) {
	    	 throw new NullPointerException("entry missing");  
	     }
	}
	
	static void validateLength(String firstName, String lastName)throws nameLengthException{  
	     if((firstName.trim().length()<3) && (lastName.trim().length()<3)) {
	    	 throw new nameLengthException("name should be minimum 3 characters");  
	     }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
			Employeee employeee = new Employeee("Nishita", "Toshi");
	    	validateEntry(employeee.firstName, employeee.lastName);
	    	validateLength(employeee.firstName, employeee.lastName);	    	
	    }catch(Exception m){
	    	System.out.println("Exception occured: "+m);
	    }

	}

}


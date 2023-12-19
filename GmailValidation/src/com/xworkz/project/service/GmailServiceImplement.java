package com.xworkz.project.service;

import com.xworkz.gamildto.GmailDto;

public class GmailServiceImplement extends GmailValidate {

	@Override
	public boolean validateDto(GmailDto dto) {
		
		if(dto!=null) {
		boolean resultFirstName=validateFirstName(dto.getFirstName());
		boolean resultLastName=validateLastName(dto.getLastName());
		
		
		
		
		
		}
		return false;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean validateFirstName(String firstName) {
		if(firstName.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	public boolean validateLastName(String lastName) {
		if(lastName.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	
	public boolean validateMiddleName(String middleName) {
		if(middleName.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	
	public boolean validateAddress(String address) {
		if(address.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		else if(address.length()>3) {
			return true;
		}
		
		return true;
	}
	
	
	public boolean validateContactNumber(String contactNumber) {
		if(contactNumber.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		else if(contactNumber.startsWith("+91")) {
			return true;
		}
		
		return true;
	}
	
    
	public boolean validateAlternateNumber(String alternateNumber) {
		if(alternateNumber.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		else if(alternateNumber.startsWith("+91")) {
			return true;
		}
		
		return true;
	}
	
	
	
	public boolean validateGender(String gender) {
		if(gender.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	
	public boolean validateaccountType(String accountType) {
		if(accountType.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	public boolean validateUserName(String userName) {
		if(userName.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	public boolean validatePassword(String password) {
		if(password.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
	
	public boolean validateDateOfBirth(String dateOfBirth) {
		if(dateOfBirth.isEmpty()) {
			System.out.println("isEmpty:");
			return false;
		}
		return true;
	}
}

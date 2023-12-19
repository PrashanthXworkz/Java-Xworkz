package com.xworkz.gamildto;

import java.util.Objects;

public class GmailDto {
         public String firstName;
         public String lastName;
         public String middleName;
         public String contactNumber;
         public String userName;
         public String alternativeContactNumber;
         public String password;
         public String dateOfBirth;
         public String gender;
         public String address;
         public String accountType;
         
         
         public GmailDto() {
        	 System.out.println("no-args constructor");
         }


		public GmailDto(String firstName, String lastName, String middleName, String contactNumber, String userName,
				String alternativeContactNumber, String password, String dateOfBirth, String gender, String address,
				String accountType) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.middleName = middleName;
			this.contactNumber = contactNumber;
			this.userName = userName;
			this.alternativeContactNumber = alternativeContactNumber;
			this.password = password;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.address = address;
			this.accountType = accountType;
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


		public String getMiddleName() {
			return middleName;
		}


		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}


		public String getContactNumber() {
			return contactNumber;
		}


		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getAlternativeContactNumber() {
			return alternativeContactNumber;
		}


		public void setAlternativeContactNumber(String alternativeContactNumber) {
			this.alternativeContactNumber = alternativeContactNumber;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getAccountType() {
			return accountType;
		}


		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}


		@Override
		public String toString() {
			return "GmailDto [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
					+ ", contactNumber=" + contactNumber + ", userName=" + userName + ", alternativeContactNumber="
					+ alternativeContactNumber + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", gender="
					+ gender + ", address=" + address + ", accountType=" + accountType + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(accountType, address, alternativeContactNumber, contactNumber, dateOfBirth, firstName,
					gender, lastName, middleName, password, userName);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GmailDto other = (GmailDto) obj;
			return Objects.equals(accountType, other.accountType) && Objects.equals(address, other.address)
					&& Objects.equals(alternativeContactNumber, other.alternativeContactNumber)
					&& Objects.equals(contactNumber, other.contactNumber)
					&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(firstName, other.firstName)
					&& Objects.equals(gender, other.gender) && Objects.equals(lastName, other.lastName)
					&& Objects.equals(middleName, other.middleName) && Objects.equals(password, other.password)
					&& Objects.equals(userName, other.userName);
		}
		
		
         
         
}

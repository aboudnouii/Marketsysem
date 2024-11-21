package Client;

import bank.Account;
public class Person {
	private String firstName;
	private String secondName;
	private int age;
	private char gender;
	private Account bankAcount;
	public Person(String firstName, String secondName, int age, char gender) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	protected void setBankAccount(float amount) {
		this.bankAcount = new Account(amount);
	}
	
	public Account getBankAcount() {
		return bankAcount;
	}

	public String toString() {
		return "Person : \n" + "Name : " + firstName + " " + secondName + "\nAge : " + age + "\nGender : " + gender;
	}
}

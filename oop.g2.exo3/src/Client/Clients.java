package Client;

import java.util.Scanner;
import java.util.Vector;

public class Clients {
	private Vector<Person> persons;

	public void creatPersons() {
		Scanner scanner = new Scanner(System.in);
		boolean b = false;
		String firstName;
		String secondName;
		int age;
		String gender;
		String a;
		int i = 0;
		do {
			System.out.println("Enter First Name:");
			firstName = scanner.next();
			System.out.println("Enter Second Name:");
			secondName = scanner.next();
			System.out.println("Enter Age:");
			age = scanner.nextInt();
			System.out.println("Enter Gender M/F:");
			gender = scanner.next();
			persons.add(new Person(firstName, secondName, age, gender.charAt(0)));
			System.out.println("Did you have bankAccount ? Y/N:");
			a = scanner.next();
			if(a.equals("Y") || a.equals("y")) {
			System.out.println("Amount ? :");
			persons.get(i).setBankAccount(scanner.nextFloat());
			persons.get(i).getBankAcount().setCard();
			}
			System.out.println("Add more persons? Y/N:");
			a = scanner.next();
			b = (a.equals("Y") || a.equals("y")) ? true : false;
			i++;
		} while (b);
		scanner.close();
	}

	public Person getPerson(int i) {
				if(i<persons.size())
				return persons.get(i);
				return null;
	}
	
	
}

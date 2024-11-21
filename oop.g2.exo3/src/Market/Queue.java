package Market;
import java.util.Vector;

import Client.Person;

public class Queue {
	private Vector<Person> persons;
	private Person temp;
	private final int sizeofQueue;

	public Queue(int sizeofQueue) {
		persons = new Vector<Person>(sizeofQueue);
		this.sizeofQueue = sizeofQueue;
	}

	public boolean checkPerson(Person person) {
		for (Person it : persons) {
			if (it == person)
				return true;
		}
		return false;
	}

	public void enterPerson(Person person) {
		if (!(isFull())) {
			if (!checkPerson(person)) {
				persons.add(person);
			}
		}

	}

	public Person exit() {
		temp = persons.get(0);
		persons.remove(persons.get(0));
		return temp;
	}

	public Person getPerson(Person person) {
		for (int i = 0; i < persons.size(); i++) {
			if ((person.getFirstName().equals(persons.get(i).getFirstName())
					&& (person.getSecondName().equals(persons.get(i).getSecondName()))
					&& (person.getAge() == persons.get(i).getAge()))) {
				temp = persons.get(i);
				persons.remove(persons.get(i));
				return temp;
			}
		}
		return null;
	}

	public boolean isFull() {
		return persons.size() == sizeofQueue;
	}

	public boolean isEmpty() {
		return persons.isEmpty();
	}

	public String toString() {
		for (Person it : persons)
			System.out.println(it);
		return null;
	}
}

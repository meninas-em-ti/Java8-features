package exercise1;

import java.util.*;

public class Person {
    private String id;
    private String name;
    private String nationality;
    private int age;

    public Person(String id, String name, String nationality, int age) {
	super();
	this.id = id;
	this.name = name;
	this.nationality = nationality;
	this.age = age;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getNationality() {
	return nationality;
    }

    public void setNationality(String nationality) {
	this.nationality = nationality;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public static List<Person> populatePersons() {
	Person person1 = new Person("p1", "Ana", "Brazil", 18);
	Person person2 = new Person("p2", "Helen", "Ireland", 29);
	Person person3 = new Person("p3", "Lucas", "Romenia", 33);
	Person person4 = new Person("p4", "Gabriel", "Brazil", 25);
	Person person5 = new Person("p5", "Ana", "Canada", 47);

	List<Person> personList = new ArrayList<Person>();
	personList.add(person1);
	personList.add(person2);
	personList.add(person3);
	personList.add(person4);
	personList.add(person5);

	return personList;
    }

    @Override
    public String toString() {
	return this.name;
    }

}

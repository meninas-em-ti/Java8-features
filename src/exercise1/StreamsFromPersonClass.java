package exercise1;

import java.util.*;
import java.util.stream.*;

public class StreamsFromPersonClass {
    private static List<Person> personList;

    public static void getAllPersonsByCountry(String country) {
	// get all persons that were born in Brazil
	// filter()

	// steps:
	// create a list of persons as attribute
	// call method populatePersons
	// call getAllPersonsByCountry
	// create the stream
	// use the method filter() to get all persons by the parameter specified

	personList.stream().filter(p -> p.getNationality().equals(country)).forEach(System.out::println);

    }

    public static List<Integer> getAllPersonsAgeByCountry(String country) {
	// get the age of all persons that were born in Brazil
	// map()

	// steps:
	// create a stream of persons
	// create a filter for the people by country
	// create a map that will return an age using getAge()
	// transform the stream of ages to a List by using the collect() method

	List<Integer> ages = personList.stream().filter(p -> p.getNationality().equals(country)).map(p -> p.getAge())
		.collect(Collectors.toList());

	return ages;
    }

    public static void sortAllPersonsByName() {
	// sorted()
	// sort all persons by name
	// hint: use method comparing() of the interface Comparator

	// steps:
	// call sort() method to sort
	// use the method comparing() of the interface Comparator

	System.out.println("Persons name before sorting using stream: " + personList);
	personList.stream().sorted(Comparator.comparing(p -> p.getName())).forEach(System.out::println);
	System.out.println("Persons name after sorting using stream: " + personList);

	System.out.println("Persons name before sorting: " + personList);
	personList.sort(Comparator.comparing(Person::getName));
	System.out.println("Persons name after sorting: " + personList);

	// on line 50 the person list is not modified because we are using stream

	// on line 54 the list is modified because we are working directly with the
	// person list

    }

    public static void getDistinctPersonsNames() {
	// distinct()
	// get a stream of persons with no repeated names

	// steps:
	// create a stream from personList
	// call the distinct() method

	// personList.stream().sorted(Comparator.comparing(p ->
	// p.getName())).distinct().forEach(System.out::println);

	Stream<Person> personStream = personList.stream().sorted(Comparator.comparing(p -> p.getName())).distinct();
	personStream.forEach(p -> System.out.println(p.getName() + p.getId()));

	// Person person5 = new Person("p5", "Ana", "Canada", 47);
	// System.out.println(personList.get(0).equals(person5));

	// obs: we stopped here, we did not figure out how to make distinct() work.
	// for the next meeting if we can, see why is the problem is happening and how
	// to fix that
    }

    public static void main(String[] args) {
	personList = Person.populatePersons();

	// System.out.println(getAllPersonsAgeByCountry("Brazil"));

	// sortAllPersonsByName();

	getDistinctPersonsNames();
    }

}

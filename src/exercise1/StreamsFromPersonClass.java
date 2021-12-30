package exercise1;

import java.util.List;

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

    public static void main(String[] args) {

	personList = Person.populatePersons();
	getAllPersonsByCountry("Brazil");

    }

}

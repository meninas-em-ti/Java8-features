package exercise;

import java.util.*;
import java.util.stream.Stream;

public class StreamsExercise {

    public static void main(String[] args) {
	createStreamFromListOfStrings();
	createStreamFromHashMap();
	createStreamFromIntegerInput();

    }

    public static void createStreamFromListOfStrings() {
	// create a stream from a List of Strings
	// ("one", "two", "three")

	// create a list of Strings
	// chamar o metodo stream()

	// ArrayList<String> listOfStrings = new ArrayList<>();
	// listOfStrings.add("one");
	// listOfStrings.add("two");
	// listOfStrings.add("three");

	List<String> listOfStrings = Arrays.asList("one", "two", "three");

	Stream<String> streamOfStrings = listOfStrings.stream();
    }

    public static void createStreamFromHashMap() {
	// create a stream from a HashMap List
	// ("key1":"avocado"; "key2": "watermelon"; "key3":"mango")
	// Hint: ….values().stream()

	// create HashMap
	// add the values in HashMap
	// apply values().stream()

	HashMap<String, String> hashMapOfStrings = new HashMap<>();
	hashMapOfStrings.put("key1", "avocado");
	hashMapOfStrings.put("key2", "watermelon");
	hashMapOfStrings.put("key3", "mango");

	Stream<String> streamOfValues = hashMapOfStrings.values().stream();

	// hashMapOfStrings.keySet().stream().forEach(System.out::println);

    }

    public static void createStreamFromElements() {
	// create a stream from values 1,2,3,4,5

	Stream<Integer> streamOfElementsFromInteger = Stream.of(1, 2, 3, 4, 5);

	Stream<String> streamOfElementsFromString = Stream.of("one", "two", "three");

    }

    public static void createStreamFromIntegerInput() {
	// create a stream from an input (1,2,3,4,5)

	// create a scanner object
	// create an ArrayList
	// use for() to ask user to insert 5 numbers
	// receive a input from user
	// system out - "Insert number:"
	// insert the values on the arrayList
	// create the variable to use the method scanner to get the input
	// create the stream from the input - stream.of()

	Scanner scanner = new Scanner(System.in);

	List<Integer> listOfInteger = new ArrayList<>();

	for (int i = 0; i < 5; i++) {
	    System.out.println("Insert number:");
	    int number = scanner.nextInt();
	    listOfInteger.add(number);
	}

	Stream<Integer> streamOfIntegers = listOfInteger.stream();
	// streamOfIntegers.forEach(System.out::println);
    }

}

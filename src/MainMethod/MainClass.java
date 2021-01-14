package MainMethod;

import Classes.Gender;
import Classes.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {

        List<Person> persons = getPersons();

        // FILTER
       List<Person> female  = persons.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        female.forEach(System.out::println);

        // SORT
        List<Person> age = persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        age.forEach(System.out::println);

        // All match

        boolean allmatch =  persons.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allmatch);

        // Any match
       boolean anymatch = persons.stream()
                .anyMatch(person -> person.getAge() > 121);
        System.out.println(anymatch);

        // None match
        boolean nonematch = persons.stream()
                .noneMatch(person -> person.getName().equals("Kayli"));
        System.out.println(nonematch);

        // MIN
        persons.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // MAX
        persons.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // group

       Map <Gender, List <Person>> group = persons.stream()
                .collect(Collectors.groupingBy(Person::getGender));
       group.forEach((gender, people) ->
       {
           System.out.println(gender);
           people.forEach(System.out::println);
       });


    }


    private static List<Person> getPersons() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)

        );

    }

}

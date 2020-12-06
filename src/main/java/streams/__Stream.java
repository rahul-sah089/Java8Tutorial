package streams;

import imperative.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class __Stream {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(new Person("Rahul", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Shivam", Gender.FEMALE),
                new Person("Bob", Gender.PREFER_NOT_SAY)
        );
        peoples.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
        peoples.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out::println);
        peoples.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);

        Predicate<Person> personPredicate = person-> Gender.FEMALE.equals(person.gender);
        boolean containsOnlyFemales = peoples.stream().anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);




    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {MALE, FEMALE, PREFER_NOT_SAY}
}

package imperative;

import sun.reflect.generics.repository.GenericDeclRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(new Person("Rahul", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Shivam", Gender.FEMALE)
        );

        //Imperative Approach
        List<Person> females = new ArrayList<Person>();
        for (Person person : peoples) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        //Declarative Approach using Java 8
        //using stream with collections
        List<Person> females2 = peoples.stream().filter(person -> Gender.FEMALE.equals(person.gender)).collect(Collectors.toList());
        females2.forEach(System.out::println);

        List<Person> females3 = peoples.stream().filter(person -> Gender.FEMALE.equals(person.gender)).collect(Collectors.toList());
        females3.forEach(System.out::println);


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

    enum Gender {MALE, FEMALE}
}

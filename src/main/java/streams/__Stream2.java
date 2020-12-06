package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class __Stream2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1L, "Rahul", 8212121L, Gender.MALE),
                new Employee(2L, "Alish", 2323232L, Gender.FEMALE),
                new Employee(1L, "Aisha", 32323232L, Gender.FEMALE),
                new Employee(1L, "Jalal", 43434333L, Gender.MALE));

        employees = employees.stream().filter(employee -> employee.salary > 8000000L).collect(Collectors.toList());
        employees.forEach(System.out::println);

    }


    static class Employee {
        private Long id;
        private String name;
        private Long salary;
        //GENDER is ENUM with MALE and FEMALE values
        private Gender gender;

        public Employee(Long id, String name, Long salary, Gender gender) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.gender = gender;
        }
    }
}

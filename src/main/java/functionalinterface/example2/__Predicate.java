package functionalinterface.example2;

import java.util.function.Predicate;

//Predicate takes an argument and returns boolean
public class __Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("+91019019101"));
        System.out.println(isPhoneNumberValid("+9101901911"));
        System.out.println(isPhoneNumberValid("+9101901912212"));
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("+9101901911"));
        System.out.println(isPhoneNumberValidPredicate.test("+91019019101"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber).test("+9101901913"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+91") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("+91") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber = phoneNumber -> phoneNumber.contains("3");
}

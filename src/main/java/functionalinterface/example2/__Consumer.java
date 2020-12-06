package functionalinterface.example2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer takes one argument and return nothing
//Bi-Consumers takes two argument and returns nothing
public class __Consumer {
    public static void main(String[] args) {
        //Normal Java Function
        Customer customerName = new Customer("Rahul", "90129021212");
        greetCustomer(customerName);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(customerName);
        greetCustomerConsumerv2.accept(customerName,false);
    }

    //Function takes one argument and returns something
    //Bi-Function takes two argument and one output
    //Consumer takes one argument and returns nothing
    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName + " thanks for registering phone number "
                + customer.customerPhoneNumber);
    };

    static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer,showPhoneNumber) -> {
        System.out.println("Hello " + customer.customerName + " thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber:"********************"));
    };

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

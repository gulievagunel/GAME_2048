package Lesson_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("dfghhg", "gfd", 30));
        customers.add(new Customer("fcx", "fghj", 20));
        customers.add(new Customer("fgh", "Brown", 15));
        Collections.sort(customers, new CustomerComparator());
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

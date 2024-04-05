package homework_nr_6;

import test.Date;
import test.Employee;
import test.Invioce;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrew", 45, "Development");
        Employee employee2 = new Employee("Alex", 30, "Testing");
        Employee employee3 = new Employee("John", 35, "Marketing");

        System.out.println("---------------");
        System.out.println("Employee1 age: " + employee1.getAge());
        employee1.setAge(40);
        System.out.println("Employee1 new age: " + employee1.getAge());

        System.out.println("---------------");
        System.out.println("Employee2 name: " + employee2.getName());
        employee2.setName("Michael");
        System.out.println("Employee2 new name: " + employee2.getName());

        System.out.println("---------------");
        System.out.println("Employee3 department: " + employee3.getDepartment());
        employee3.setDepartment("Testing");
        System.out.println("Employee3 new department: " + employee3.getDepartment());

        Invoice newInvoice1 = new Invoice("ashfdashgdf", "euryweoiuy", 4, 67.4);
        Invoice newInvoice2 = new Invoice("ashfdashgdf", "ehjkhy", 3, -2);
        Invoice newInvoice3 = new Invoice("ashfdashgdf", "iuouyieoiuy", 2, 95.1);


        System.out.println("---------------");
        System.out.println("Price of invoice 1: " + newInvoice1.getPrice());
        System.out.println("Quantity of invoice 1: " + newInvoice1.getQuantity());
        System.out.println("Amount of invoice 1: " + newInvoice1.getAmount());
        newInvoice1.setPrice(-5);
        System.out.println("Changed price to -5");
        System.out.println("New amount of invoice 1: " + newInvoice1.getAmount());

        System.out.println("---------------");
        System.out.println("Price of invoice 2: " + newInvoice2.getPrice());
        System.out.println("Quantity of invoice 2: " + newInvoice2.getQuantity());
        System.out.println("Amount of invoice 2: " + newInvoice2.getAmount());
        newInvoice2.setPrice(10);
        System.out.println("Changed price to 10");
        System.out.println("New amount of invoice 2: " + newInvoice2.getAmount());

        System.out.println("---------------");
        System.out.println("Price of invoice 3: " + newInvoice3.getPrice());
        System.out.println("Quantity of invoice 3: " + newInvoice3.getQuantity());
        System.out.println("Amount of invoice 3: " + newInvoice3.getAmount());
        newInvoice3.setQuantity(-2);
        System.out.println("Changed quantity to -2");
        System.out.println("New amount of invoice 3: " + newInvoice3.getAmount());

        Date myDate1 = new Date(4, 4, 2024);
        Date myDate2 = new Date(12, 8, 2023);

        System.out.println("---------------");
        myDate1.displayDate();
        System.out.println();
        myDate2.displayDate();
        System.out.println();


//        System.out.println("---------------");
//        myDate1.setDay(24);
//        System.out.println();
//        myDate2.setMonth(13);
    }
}

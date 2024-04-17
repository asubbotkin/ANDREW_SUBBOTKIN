package homework_nr_10.testing_employee;

public class Main {
    public static void main(String[] args) {

        Employee objectEmployee1 = new Employee("Alexei", "Ivanov", 25, "Software Engineering");
        Employee objectEmployee2 = new Employee("Nikolai", "Petrov", 29, "Software Testing");
        Employee objectEmployee3 = new Employee("Ivan", "Sidorov", 38, "DevOps Engineer");
        Employee objectEmployee4 = new Employee("Petr", "Nikonov", 37, "Security Engineer");
        Employee objectEmployee5 = new Employee("Alexandr", "Frolov", 45, "Data Engineer");

        System.out.println("---Do they work in Software Engineering department---");
        testEmployee(objectEmployee1, (Employee e) -> {
            return (e.department.equals("Software Engineering"));
        });

        testEmployee(objectEmployee3, (Employee e) -> {
            return (e.department.equals("Software Engineering"));
        });

        System.out.println("---A they over 20---");
        testEmployee(objectEmployee1, (Employee e) -> {
            return (e.age > 20);
        });

        testEmployee(objectEmployee4, (Employee e) -> {
            return (e.age > 20);
        });

        System.out.println("---Do their names start with A---");
        testEmployee(objectEmployee3, (Employee e) -> {
            return e.name.startsWith("A");
        });

        testEmployee(objectEmployee5, (Employee e) -> {
            return e.name.startsWith("A");
        });

    }

    public static void testEmployee(Employee employee, Testing algorithm) {
        System.out.println(algorithm.checkEmployee(employee));
    }
}

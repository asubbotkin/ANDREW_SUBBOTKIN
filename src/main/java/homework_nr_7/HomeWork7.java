package homework_nr_7;

public class HomeWork7 {
    public static void main(String[] args) {

        Pensioned pensioned1 = new Pensioned("Alexi", "Ivanov", "12.03.2020");
        Pensioned pensioned2 = new Pensioned("Ivan", "Fedorov", "01.09.2008");
        System.out.println();
        System.out.println("---------Pensioners------------");
        System.out.println();
        pensioned1.printMyName();
        pensioned2.printMyName();

        Programmer programmer1 = new Programmer("Denis", "Frolov", "Pentalog", "Node.js", 8);
        Programmer programmer2 = new Programmer("Mihail", "Petrov", "Endava", "Java", 7);
        Employee programmer3 = new Programmer("Andrei", "Ivanov", "Amdaris", "Python", 6);

        System.out.println();
        System.out.println("---------Programmers------------");
        programmer1.printMyName();
        programmer1.works();
        System.out.println();
        programmer2.printMyName();
        programmer2.works();
        System.out.println();
        programmer3.printMyName();
        programmer3.works();

        Employee manager1 = new Manager("Vasilii", "Nikonov", "New Line", 80, "Sales");
        Manager manager2 = new Manager("Vitalii", "Sidorov", "Linella", 28, "Purchase of goods");
        Manager manager3 = new Manager("Serghei", "Suhov", "DAAC Hermes", 58, "Logistics");

        System.out.println();
        System.out.println("---------Managers------------");
        manager1.printMyName();
        manager1.works();
        System.out.println();
        manager2.printMyName();
        manager2.works();
        System.out.println();
        manager3.printMyName();
        manager3.works();

        System.out.println("---------Managers------------");
        Person[] personsArray = new Person[]{
                pensioned1, pensioned2, programmer1, programmer2, programmer3, manager1, manager2, manager3
        };
        for (Person person : personsArray) {
            if (person instanceof Manager) {
                System.out.println(person.name);
            }
        }
    }
}
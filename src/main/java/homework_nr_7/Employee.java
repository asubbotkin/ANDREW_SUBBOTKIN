package homework_nr_7;

public abstract class Employee extends Person{
    protected String companyName;

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }
    public abstract void works();
}

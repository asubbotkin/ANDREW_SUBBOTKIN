package homework_nr_7;

public class Programmer extends Employee{
    private String programmingLanguage;
    private int yearsOfExpiriance;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExpiriance) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExpiriance = yearsOfExpiriance;
    }

    @Override
    public void printMyName() {
        System.out.println(name + " " + surname + ".");
    }

    @Override
    public void works() {
        System.out.println("Works in " + companyName + " as " + programmingLanguage + " programmer.");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getYearsOfExpiriance() {
        return yearsOfExpiriance;
    }
}

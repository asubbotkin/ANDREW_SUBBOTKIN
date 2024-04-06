package homework_nr_7;

public class Pensioned extends Person{
    private String retireDate;

    public Pensioned(String name, String surname, String retireDate) {
        super(name, surname);
        this.retireDate = retireDate;
    }
    public void printMyName(){
        System.out.println(name + " " + surname + " " + retireDate);
    }

    public String getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(String retireDate) {
        this.retireDate = retireDate;
    }
}

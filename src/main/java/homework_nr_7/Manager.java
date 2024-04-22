package homework_nr_7;

public class Manager extends Employee{
    private int teamSize;
    private String teamName;

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void printMyName() {
        System.out.println(name + " " + surname + ".");
    }

    @Override
    public void works() {
        System.out.println("Works in " + companyName + " as " + teamName + " manager.");
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}

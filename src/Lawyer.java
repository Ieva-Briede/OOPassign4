public class Lawyer extends Person {
    private int lawyerID;
    private int helpedInCrimesSolving;

    public Lawyer() {

    }

    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving) {
        super.setName(name);
        super.setSurname(surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;


    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    @Override
    public String toString() {
        return "Lawyer: " +
                "name='" + super.getName() +
                ", surname='" + super.getSurname() +
                ", lawyerID=" + lawyerID +
                ", helpedInCrimesSolving=" + helpedInCrimesSolving;
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        Officer officer1 = new Officer("Bruce", "Lee", 1050, 5);
        Officer officer2 = new Officer("James", "Bond", 1051, 127);
        Officer officer3 = new Officer("John", "Strange", 1052, 34);
        Officer officer4 = new Officer("David", "Mail", 1053, 56);
        Officer officer5 = new Officer("Luis", "Sailor", 1054, 91);
        Officer officer6 = new Officer("John", "Tailor", 1055, 66);
        Officer officer7 = new Officer("Alice", "Johnson", 1056, 81);

        District district1 = new District("District 1", "Riga", 6010, person);
        District district2 = new District("District 2", "Ogre", 6020, person);

        Lawyer lawyer1 = new Lawyer("Antony", "Page", 72021, 77);
        Lawyer lawyer2 = new Lawyer("Lisa", "Moonlight", 72022, 35);
        Lawyer lawyer3 = new Lawyer("Elisa", "Tree", 72023, 19);

        district1.addNewPerson(officer1);
        district1.addNewPerson(officer2);
        district1.addNewPerson(officer3);
        district1.addNewPerson(lawyer1);
        district1.addNewPerson(lawyer2);

        district2.addNewPerson(officer4);
        district2.addNewPerson(officer5);
        district2.addNewPerson(officer6);
        district2.addNewPerson(officer7);
        district2.addNewPerson(lawyer3);

        System.out.println("District 1: \n" + district1.toString());
        System.out.println("District 2: \n" + district2.toString());


        ArrayList<District> districts = new ArrayList<District>();

        Collections.addAll(districts, district1, district2);
        System.out.println("All districts: " + districts);

        int theLargestNumberOfPersons = 0;
        District largestDistrict = null;

        for (District d : districts) {
            if (d.getPersonsInTheDistrict().size() > theLargestNumberOfPersons) {
                largestDistrict = d;
                theLargestNumberOfPersons = d.getPersonsInTheDistrict().size();
            }
        }
        System.out.println("The district with the largest amount of people is: " + largestDistrict.getTitle());

    }
}







import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String firstName = scanner.nextLine();
            if (firstName.equals("")) break;
            String lastName = scanner.nextLine();
            String identify = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName, lastName, identify));
        }
        for (PersonalInformation data: infoCollection){
            System.out.println(data.getFirstName()+" "+data.getLastName());
        }

    }
}

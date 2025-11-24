
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();
        while (true){
            System.out.print("?");
            String request = scan.nextLine();
            if (request.equals("Quit")){
                break;
            }
            if (request.equals("Add")){
                // Need to call method from Bird class
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                if (!birds.contains(name)){
                    birds.add(new Bird(name, latinName));
                }else{
                    for (Bird b: birds){
                        if (b.getName().equals(name)){
                            b.setObservation();
                        }
                    }
                }
            }
            if (request.equals("Observation")){
                // from bird class;
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                boolean flag = false;
                for (Bird b: birds){
                    if (b.getName().equals(bird)){
                        flag = true;
                        b.setObservation();
                    }
                }
                if (!flag){
                    System.out.println("Not a bird!");
                }

            }

            if (request.equals("All")){
                for (Bird b: birds){
                    System.out.println(b);
                }
            }

            if (request.equals("One")){
                System.out.print("Bird?");
                String bird_name = scan.nextLine();
                for (Bird b: birds){
                    if (b.getName().equals(bird_name)){
                        System.out.println(b);
                    }
                }
            }
        }

    }

}

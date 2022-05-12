import java.util.*;

public class AnimalMain {
    public static void main(String[] args) throws Exception {
        AnimalMenu();
        
    }

    public static void AnimalMenu () {
        Scanner input = new Scanner(System.in);

        ArrayList<Animal> listNames = new ArrayList<>();
        // Animal lucky = new Animal("Lucky", false);
        // listNames.add(lucky);
        // listNames.add(new Animal("wucky", true));

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

         while(true) {
            System.out.println("Enter name");
            String name = input.nextLine();

            if(name.isBlank()) {
                System.out.println(listNames.toString());
                break;
            }
        
            System.out.println("Is it a dog? true or false");
            Boolean isDog = input.nextLine().equalsIgnoreCase("true");

            listNames.add(new Animal(name, isDog));

            System.out.println();
           
            }
        }
}

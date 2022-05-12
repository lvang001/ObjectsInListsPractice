import java.util.*;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<TvShow> showList = new ArrayList<>();


        System.out.println("Tv Shows");
        System.out.println("Press Enter to exit");
        while(true) {

            System.out.println("Enter show");
            String show = scanner.nextLine();

            if(show.isBlank()) {
                System.out.println(showList);
                break;
            }

            System.out.println("How many episodes?");
            int number = Integer.parseInt(scanner.nextLine());

            System.out.println("What is genre?");
            String genre = scanner.nextLine();

            showList.add(new TvShow(show, number, genre));
        }

    }

}

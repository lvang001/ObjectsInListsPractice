import java.util.*;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<Book>();

        // Book lucky = new Book("henry", 12, 1834);

        // lucky.getTitle();

        while(true) {

            System.out.println("Enter book name: ");
            String bookName = scanner.nextLine();

            if(bookName.isBlank()) {
                System.out.println("What information will be printed: everything or name?");
                String answer = scanner.nextLine();

                for(Book e : books) {
                    if(answer.equals("name")) {
                        System.out.println(e.getTitle());
                    } else {
                        System.out.println(books.toString());
                    }
                }
               break;
            }

            System.out.println("Enter number of pages: ");
            int page = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(bookName, page, year));
        }
    }
}

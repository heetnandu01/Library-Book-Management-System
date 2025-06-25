import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Student record Management System");
        Scanner sc = new Scanner(System.in);
        LibraryDatabase db = new LibraryDatabase();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");

            System.out.print("Enter the choice No: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting....");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    db.addBook(id, title, author);
                    break;

                case 2:
                    db.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    db.searchBook(searchId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    db.removeBook(removeId);
                    break;

                case 5:
                    System.out.println("Exiting Library System...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
    }
}
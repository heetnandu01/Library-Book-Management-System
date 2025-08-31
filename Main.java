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
            System.out.println("5. Update Book Details");
            System.out.println("6. Search Books by Author");
            System.out.println("7. Sort Books by Title");
            System.out.println("8. Sort Books by ID");
            System.out.println("9. Exit");

            System.out.print("Enter the choice No: ");
            int choice = sc.nextInt();

            if (choice == 9) {
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
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new title (leave blank to keep current): ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter new author (leave blank to keep current): ");
                    String newAuthor = sc.nextLine();
                    db.updateBook(updateId, newTitle, newAuthor);
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = sc.nextLine();
                    db.searchByAuthor(authorName);
                    break;

                case 7:
                    db.sortByTitle();
                    break;

                case 8:
                    db.sortById();
                    break;

                case 9:
                    System.out.println("Exiting Library System...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
    }
}

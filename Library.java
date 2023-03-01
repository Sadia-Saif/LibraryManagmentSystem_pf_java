import java.util.Scanner;

class Library {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;

        while (input != 3) {

            menu();

            input = sc.nextInt();

            if (input == 1) {
                StudentMenu();
            } else if (input == 2) {
                librarianMenu();
            } else if (input == 3) {
                System.exit(0);

            } else {
                System.out.print("\nInvalid choice\n");
            }

        }

        System.out.print("\nGood bye :)\n");
        sc.close();
    }

    // ..........................Menu list........................................

    public static void menu() {
        System.out.println("\n****************");
        System.out.println("\n    Welcome!    ");
        System.out.println("\n****************");
        System.out.println("\nChoose 1 for Student");
        System.out.println("Choose 2 for Librarian");
        System.out.println("Choose 3 for exit");
        System.out.print("\nChoose the operation you want to perform: ");
    }

    // Librarian menu list
    public static void librarianMenu() {
        System.out.println("Choose 1 to Add new Book");
        System.out.println("Choose 2 to Edit a Book");
        System.out.println("Choose 3 to Delete a Book");
        System.out.println("Choose 4 to View all Book");
        System.out.println("Choose 5 to Search a book by ID");
        System.out.println("Choose 6 to See Profile");
        System.out.print("\nChoose the operation you want to perform: ");
        int librarianMenuInput = sc.nextInt();

    }

    // Student menu list

    public static void StudentMenu() {
        System.out.println("Choose 1 to View a Book");
        System.out.println("Choose 2 to Issue a Book");
        System.out.println("Choose 3 to Return a Book");
        System.out.println("Choose 4 to Search a Book");
        System.out.println("Choose 5 to See Profile");
        System.out.print("\nChoose the operation you want to perform: ");
        int StudentMenuInput = sc.nextInt();
    }

}
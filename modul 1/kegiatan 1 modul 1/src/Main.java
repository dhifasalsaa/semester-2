import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Library System ====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Scanner NIM = new Scanner(System.in);
                    String nim;
                    System.out.print("Enter your NIM : ");
                    nim = NIM.nextLine();

                    if (nim.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User not found!!");
                    }
                    break;
                    //scanner.nextLine();

                case 2:
                    Scanner Inputan = new Scanner(System.in);
                    String username ;
                    String password ;
                    System.out.print("Enter your username  : ");
                    username = Inputan.nextLine();
                    System.out.print("Enter your password  : ");
                    password = Inputan.nextLine();

                    if (username.equals("salsa") && password.equals("12345")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("User admin not found!!");
                    }

                    // No need to close adminInput
                    break;

                case 3:
                    System.out.println("adioss");
                    //input.close();
                    System.exit(0);

                default:
                    System.out.println("Input not valid!!");
                    break;
            }
        }
    }
}
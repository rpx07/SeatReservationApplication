import java.util.Scanner;
public class Login_access {
    public static String username;
    public static String password;
    int selection;
    public static int mn_log =0;
    Scanner scanner = new Scanner(System.in);
    public void bl(int opt_for) {

        selection = opt_for;
    }
    public void ul(int k) {

        selection = k;
    }
    public void sl(int k) {

        selection = k;
    }
    public void loop()
    {
        System.out.println("Enter the username: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

    }


    public int access1() {
        if (selection == 1 && username.equals("business1") && password.equals("owner1")) {
            System.out.println("You have successfully logged in");
            return 1;
        } else if (selection == 1 && username.equals("business2") && password.equals("owner2")) {
            System.out.println("You have successfully logged in");
            return 1;
        } else if (selection == 1 && username.equals("business3") && password.equals("owner3")) {
            System.out.println("You have successfully logged in");
            return 1;
        } else if (selection == 1 && username.equals("business4") && password.equals("owner4")) {
            System.out.println("You have successfully logged in");
            return 1;
        } else if (selection == 1 && username.equals("business5") && password.equals("owner5")) {
            System.out.println("You have successfully logged in");
            return 1;
        } else {
            System.out.println("Wrong username or password\n"+ "Please enter a valid username or password");
            return 0;
        }

    }


    public  int access2() {
        if (selection == 3 && username.equals("regular1") && password.equals("user1")) {
            if (Main.restrict != 1) {
                System.out.println("You have successfully logged in");
                mn_log = 1;
                return mn_log;
            } else {
                System.out.println("You are not allowed to use the application");
                return -1;
            }

        } else if (selection == 3 && username.equals("regular2") && password.equals("user2")) {
            if (Main.restrict != 2) {
                System.out.println("You have successfully logged in");
                mn_log = 2;
                return mn_log;
            } else {
                System.out.println("You are not allowed to use the application");
                return -1;
            }
        } else if (selection == 3 && username.equals("regular3") && password.equals("user3")) {
            if (Main.restrict != 3) {
                System.out.println("You have successfully logged in");
                mn_log = 3;
                return mn_log;
            } else {
                System.out.println("You are not allowed to use the application");
                return -1;
            }

        } else if (selection == 3 && username.equals("regular4") && password.equals("user4")) {
            if (Main.restrict != 4) {
                System.out.println("You have successfully logged in");
                mn_log = 4;
                return mn_log;
            } else {
                System.out.println("You are not allowed to use the application");
                return -1;
            }
        }

        else if (selection == 3 && username.equals("regular5") && password.equals("user5")) {
            if (Main.restrict != 5) {
                System.out.println("You have successfully logged in");
                mn_log = 5;
                return mn_log;
            } else {
                System.out.println("You are not allowed to use the application");
                return -1;
            }
        }
        else {
            System.out.println("Wrong username or password \n" + "Please enter a valid username or password");
            return 0;
        }
    }






    public int access3() {
        if (selection == 2 && username.equals("System") && password.equals("admin")) {
            System.out.println("You have successfully logged in");
                return 1;
        }

        else {
            System.out.println("Wrong username or password\n"+ "Please enter a valid username or password");
            return 0;
        }
    }
}



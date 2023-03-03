import java.util.Scanner;
public class Business_services {

    private static int size;
    private static float pricing;
static Scanner scanner = new Scanner(System.in);
    public void parameter () {
        System.out.println("Enter the size of the room:");
        size = scanner.nextInt();
        scanner.nextLine();
        User_services.n_size = size;
        User_services.seat_arr = new String[User_services.n_size][User_services.n_size];

    }



    public void price () {
        System.out.println("Enter the regular price of the seat:");
        pricing = scanner.nextFloat();
        scanner.nextLine();
        User_services.price = pricing;
    }

    public static void list_users(){
System.out.println("""
        1) User1
        2) User2
        3) User3
        4) User4
        5) User5
        """);
    }
}

import java.util.ArrayList;


public class Admin_service {
    public static int comp_count;
    private static ArrayList<String> complain = new ArrayList<>();
    private static int numbering = 0;


    public static void admin_complain() {
        complain.add(User_services.comp_mess);
        comp_count++;
    }

    public static void complain_list() {
        for (String check_1 : complain) {
            numbering++;
            System.out.println(numbering + ")" + check_1);
        }
    }

    public static void user_access() {
        System.out.println("User1 record\n" + User_services.data_store + "\n");
        System.out.println("User2 record\n" + User_services.data_store2 + "\n");
        System.out.println("User3 record\n" + User_services.data_store3 + "\n");
        System.out.println("User4 record\n" + User_services.data_store4 + "\n");
        System.out.println("User5 record\n" + User_services.data_store5);
    }


}





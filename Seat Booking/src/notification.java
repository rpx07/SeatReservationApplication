import java.util.ArrayList;

public class notification {
    private static String sell_mess = "A new seat has been added to the sell list";
    private static ArrayList<String> messages = new ArrayList<>();
   private static int numbering_1 =0;



    public static void note(){
if(User_services.note_counter>0) {
    messages.add(User_services.mess);
}
        else if(User_services.sell_counter>0){
            messages.add(sell_mess);
        }

    }


    public static void list(){
        for(String message: messages){
                numbering_1++;
            System.out.println(numbering_1 +")"+message);
        }
    }
}
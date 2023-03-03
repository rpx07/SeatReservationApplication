import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;

public class User_services {
    private static HashMap<Integer,HashMap<Integer,HashMap<String,Integer>>> collections = new HashMap<>();
//    roomType,timeStamp,customerId,seatNo
    static {

    HashMap<Integer,HashMap<String,Integer>> cinema = new HashMap<>();
    HashMap<Integer,HashMap<String,Integer>> restaurant = new HashMap<>();
    HashMap<Integer,HashMap<String,Integer>> airplane = new HashMap<>();
    HashMap<Integer,HashMap<String,Integer>> hotel = new HashMap<>();
    HashMap<Integer,HashMap<String,Integer>> conference = new HashMap<>();
    collections.put(1,restaurant);
    collections.put(2,cinema);
    collections.put(3,airplane);
    collections.put(4,conference);
    collections.put(5,hotel);
}
   public static int n_size;
    private static int mess_select,change_select,sell_select,cancel_select;

     public static float price, wallet,swa;
    private static int time,booked_seat,initial_select;
    public static String time_show,dis_count, price_input,num1,num2,num, time_swap,option_select,serve,invert1,invert2,inversion,mess,comp_mess;
   public static String [][] seat_arr;
    private static int input,index1,index2,discount,  user_s1, user_s11,user_s2, user_s22, user_s3, user_s33, user_s4, user_s44, user_s5, user_s55, swap1, swap2, len, timer1, timer2, timer3, timer4;
    int count, count1;
    private static int seat_1 =0;
    private static int seat_2 =0;
    public static int sell_counter=0;
    public static int note_counter=0;
    private int ex_not=0;

public static ArrayList<Object> data_store = new ArrayList<>();
public static ArrayList<Object> data_store2 = new ArrayList<>();
public static ArrayList<Object> data_store3 = new ArrayList<>();
public static ArrayList<Object> data_store4 = new ArrayList<>();
public static ArrayList<Object> data_store5 = new ArrayList<>();

    HashMap<String,Object> sell1 = new HashMap<>();
    HashMap<String, Object> sell2 = new HashMap<>();
    HashMap<String, Object> sell3 = new HashMap<>();
    HashMap<String, Object> sell4 = new HashMap<>();
    HashMap<String, Object> sell5 = new HashMap<>();

    public static float wallet1, wallet2, wallet3, wallet4, wallet5;
    public static String time1, time2, time3, time4, time5, yes_no,percentage;
    public static SimpleDateFormat current_date = new SimpleDateFormat("dd/MM/yyyy");
    public static Date date = new Date();
    Scanner scanner = new Scanner(System.in);
    int option;



    User_services(){
        n_size = 4;
        seat_arr = new String[n_size][n_size];
        price = 200;
    }

    public int record(){
        if(Login_access.username.equals("regular1")){
            if(data_store.isEmpty()){
                return 0;
            }
            else{
                System.out.println("User1 record\n");
                System.out.println(data_store);
            }
        }
        else if(Login_access.username.equals("regular2")){
            if(data_store2.isEmpty()){
                return 0;
            }
            else{
                System.out.println("User2 record\n");
                System.out.println(data_store2);
            }
        }
        else if(Login_access.username.equals("regular3")){
            if(data_store3.isEmpty()){
                return 0;
            }
            else{
                System.out.println("User3 record\n");
                System.out.println(data_store3);
            }
        }
        else if(Login_access.username.equals("regular4")){
            if(data_store4.isEmpty()){
                return 0;
            }
            else{
                System.out.println("User4 record\n");
                System.out.println(data_store4);
            }
        }

        else if(Login_access.username.equals("regular5")) {
            if (data_store5.isEmpty()) {
                return 0;
            } else {
                System.out.println("User5 record\n");
                System.out.println(data_store5);
            }
        }
        return 1;
    }

    public void cancel_booking(){
int know_index = data_store.indexOf(cancel_select);
if (Login_access.username.equals("regular1")){
    data_store.remove(know_index);
    data_store.remove(know_index);
    data_store.remove(know_index);
    data_store.remove(know_index);
    data_store.remove(know_index);
}
        else if (Login_access.username.equals("regular2")){
            data_store2.remove(know_index);
            data_store2.remove(know_index);
            data_store2.remove(know_index);
            data_store2.remove(know_index);
            data_store2.remove(know_index);
        }
        else if (Login_access.username.equals("regular3")){
            data_store3.remove(know_index);
            data_store3.remove(know_index);
            data_store3.remove(know_index);
            data_store3.remove(know_index);
            data_store3.remove(know_index);
        }
        else if (Login_access.username.equals("regular4")){
            data_store4.remove(know_index);
            data_store4.remove(know_index);
            data_store4.remove(know_index);
            data_store4.remove(know_index);
            data_store4.remove(know_index);
        }
        else if (Login_access.username.equals("regular5")){
            data_store5.remove(know_index);
            data_store5.remove(know_index);
            data_store5.remove(know_index);
            data_store5.remove(know_index);
            data_store5.remove(know_index);
        }

    }

    public void index(){
        int a = data_store.indexOf(change_select);
        if(Login_access.username.equals("regular1")){
            data_store.set((a+2),time_show);
            data_store.set((a+3),inversion);
            data_store.set((a+4),wallet);
        }
        if(Login_access.username.equals("regular2")){
            data_store2.set((a+2),time_show);
            data_store2.set((a+3),inversion);
            data_store2.set((a+4),wallet);
        }
        if(Login_access.username.equals("regular3")){
            data_store3.set((a+2),time_show);
            data_store3.set((a+3),inversion);
            data_store3.set((a+4),wallet);
        }
        if(Login_access.username.equals("regular4")){
            data_store4.set((a+2),time_show);
            data_store4.set((a+3),inversion);
            data_store4.set((a+4),wallet);
        }
        if(Login_access.username.equals("regular5")){
            data_store5.set((a+2),time_show);
            data_store5.set((a+3),inversion);
            data_store5.set((a+4),wallet);
        }
    }

    public void show(){
        do{System.out.println("""
                1) Book a seat
                2) Cancel Booking
                3) Change Booking
                4) Sell the booked seat
                5) See the sell list 
                6) See the exchange request 
                7) Message service 
                8) Notifications 
                """);
        initial_select = scanner.nextInt();
        scanner.nextLine();
        if(initial_select<=0 || initial_select>8){
            System.out.println("Invalid Input");
        }

        }while(initial_select<=0 || initial_select>8);


        if(initial_select==2){
            input = 2;
            seat();
        }
        else if(initial_select==3){
            input = 1;
            seat();
        }
        else if(initial_select==4){
            input = 3;
            seat();
        }
        else if(initial_select==5){
            input = 7;
            seat();
        }
        else if(initial_select==6){
            input = 8;
            seat();
        }
        else if(initial_select==7){
            input =6;
            seat();
        }
        else if(initial_select==8){
            input =9;
            seat();
        }
    }

    public static void service_type(){
        if(Main.s==1){
            serve="Restaurant";
        }
        else if(Main.s==2){
            serve="Cinema";
        }
        else if(Main.s==3){
            serve="Airplane";
        }
        else if(Main.s==4){
            serve="Conference room";
        }
        else if(Main.s==5){
            serve="Hotel";
        }
    }

    public  void storing(){
        service_type();
        String convert1 = Integer.toString(seat_1);
        String convert2 = Integer.toString(seat_2);
        String combine = "("+convert1+"," + convert2+")";


        if(Login_access.username.equals("regular1")){
        Main.count_1++;
        data_store.add(Main.count_1);
        data_store.add(serve);
        data_store.add(time_show);
        data_store.add(combine);
        data_store.add(wallet);
        data_store.add("\n");}

        else if(Login_access.username.equals("regular2")){
            Main.count_2++;
            data_store2.add(Main.count_2);
            data_store2.add(serve);
            data_store2.add(time_show);
            data_store2.add(combine);
            data_store2.add(wallet);
            data_store2.add("\n");}


        else if(Login_access.username.equals("regular3")){
            Main.count_3++;
            data_store3.add(Main.count_3);
            data_store3.add(serve);
            data_store3.add(time_show);
            data_store3.add(combine);
            data_store3.add(wallet);
            data_store3.add("\n");}


        else if(Login_access.username.equals("regular4")){
            Main.count_4++;
            data_store4.add(Main.count_4);
            data_store4.add(serve);
            data_store4.add(time_show);
            data_store4.add(combine);
            data_store4.add(wallet);
            data_store4.add("\n");}

        else if(Login_access.username.equals("regular5")){
            Main.count_5++;
            data_store5.add(Main.count_5);
            data_store5.add(serve);
            data_store5.add(time_show);
            data_store5.add(combine);
            data_store5.add(wallet);
            data_store5.add("\n");}


        }




    public void exchange() {
        switch (Login_access.username) {
            case "regular1":
                user_s1 = seat_1;
                user_s11 = seat_2;
                time1 = time_show;
                wallet1 = wallet;
                break;
            case "regular2":
                user_s2 = seat_1;
                user_s22 = seat_2;
                time2 = time_show;
                wallet2 = wallet;
                break;
            case "regular3":
                user_s3 = seat_1;
                user_s33 = seat_2;
                time3 = time_show;
                wallet3 = wallet;
                break;
            case "regular4":
                user_s4 = seat_1;
                user_s44 = seat_2;
                time4 = time_show;
                wallet4 = wallet;
                break;
            case "regular5":
                user_s5 = seat_1;
                user_s55 = seat_2;
                time5 = time_show;
                wallet5 = wallet;
                break;
            default:
                break;
        }

        if (input == 5 && Login_access.username.equals("regular2")) {

                System.out.println("Available options:\n" + "(1)" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date));

        }

        else if (input == 5 && Login_access.username.equals("regular3")) {

                System.out.println("Available options:\n" + "(1)" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date) + "\n");
                System.out.println("(2)" + "Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date));
                System.out.println("If the seat and the other regarding details are zero then it is not available please do not select that option");


            }


        else if (input == 5 && Login_access.username.equals("regular4")) {

                System.out.println("Available options:\n" + "(1)" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date) + "\n");
                System.out.println("(2)" + "Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date) + "\n");
                System.out.println("(3)" + "Seat number:" + user_s3 + "," + user_s33 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet3 + "\n" + "Date:" + current_date.format(date));
            System.out.println("If the seat and the other regarding details are zero then it is not available please do not select that option");

        }




        else if (input == 5 && Login_access.username.equals("regular5")) {
            System.out.println("Available options:\n" + "(1)" +"Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date) + "\n");
            System.out.println("(2)" +"Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date) + "\n");
            System.out.println("(3)" +"Seat number:" + user_s3 + "," + user_s33 + "\n" + "Time:" + time3 + "\n" + "Price:" + wallet3 + "\n" + "Date:" + current_date.format(date) + "\n");
            System.out.println("(4)" +"Seat number:" + user_s4 + "," + user_s44 + "\n" + "Time:" + time4 + "\n" + "Price:" + wallet4 + "\n" + "Date:" + current_date.format(date));
            System.out.println("If the seat and the other regarding details are zero then it is not available please do not select that option");

        }
    }


    public void know() {
        if (Login_access.username.equals("regular1")) {
            if (option_select.equals("regular2")) {
                System.out.println("Do you want to exchange your seat with User2?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular3")) {
                System.out.println("Do you want to exchange your seat with User3?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s3 + "," + user_s33 + "\n" + "Time:" + time3 + "\n" + "Price:" + wallet3 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular4")) {
                System.out.println("Do you want to exchange your seat with User4?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s4 + "," + user_s44 + "\n" + "Time:" + time4 + "\n" + "Price:" + wallet4 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular5")) {
                System.out.println("Do you want to exchange your seat with User5?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s5 + "," + user_s55 + "\n" + "Time:" + time5 + "\n" + "Price:" + wallet5 + "\n" + "Date:" + current_date.format(date));
            }

        }


        else if (Login_access.username.equals("regular2")) {
            if (option_select.equals("regular1")) {
                System.out.println("Do you want to exchange your seat with User1?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular3")) {
                System.out.println("Do you want to exchange your seat with User3?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s3 + "," + user_s33 + "\n" + "Time:" + time3 + "\n" + "Price:" + wallet3 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular4")) {
                System.out.println("Do you want to exchange your seat with User4?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s4 + "," + user_s44 + "\n" + "Time:" + time4 + "\n" + "Price:" + wallet4 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular5")) {
                System.out.println("Do you want to exchange your seat with User5?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s5 + "," + user_s55 + "\n" + "Time:" + time5 + "\n" + "Price:" + wallet5 + "\n" + "Date:" + current_date.format(date));
            }
        }


        else if (Login_access.username.equals("regular3")) {
            if (option_select.equals("regular1")) {
                System.out.println("Do you want to exchange your seat with User1?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular4")) {
                System.out.println("Do you want to exchange your seat with User4?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s4 + "," + user_s44 + "\n" + "Time:" + time4 + "\n" + "Price:" + wallet4 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular5")) {
                System.out.println("Do you want to exchange your seat with User5?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s5 + "," + user_s55 + "\n" + "Time:" + time5 + "\n" + "Price:" + wallet5 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular2")) {
                System.out.println("Do you want to exchange your seat with User2?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date));
            }
        }



        else if (Login_access.username.equals("regular4")) {
            if(option_select.equals("regular1")){
                System.out.println("Do you want to exchange your seat with User1?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s1 + "," + user_s11 + "\n" + "Time:" + time1 + "\n" + "Price:" + wallet1 + "\n" + "Date:" + current_date.format(date));
            }
            else if (option_select.equals("regular5")) {
                System.out.println("Do you want to exchange your seat with User5?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s5 + "," + user_s55 + "\n" + "Time:" + time5 + "\n" + "Price:" + wallet5 + "\n" + "Date:" + current_date.format(date));
            } else if (option_select.equals("regular2")) {
                System.out.println("Do you want to exchange your seat with User2?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s2 + "," + user_s22 + "\n" + "Time:" + time2 + "\n" + "Price:" + wallet2 + "\n" + "Date:" + current_date.format(date));
            }
            else if (option_select.equals("regular3")) {
                System.out.println("Do you want to exchange your seat with User3?" + "\n" + "Details:" + "\n" + "Seat number:" + user_s3 + "," + user_s33 + "\n" + "Time:" + time3 + "\n" + "Price:" + wallet3 + "\n" + "Date:" + current_date.format(date));
            }

        }
    }


        public void exchange1(){
        if(option==1){
            know();
            yes_no = scanner.nextLine();
            if(yes_no.equals("yes")){
                System.out.println("Exchange is successful");

                if(Login_access.username.equals("regular2")){
                    swap1 = user_s1;
                    user_s1 = user_s2;
                    user_s2 = swap1;
                    swap2 = user_s11;
                    user_s11 = user_s22;
                    user_s22 = swap2;
                    time_swap = time1;
                    time1 = time2;
                    time2 = time_swap;
                    swa= wallet1;
                    wallet1 = wallet2;
                    wallet2 =swa;

                }
                                else if(Login_access.username.equals("regular3")){
                                    swap1 = user_s1;
                                    user_s1 = user_s3;
                                    user_s3 = swap1;
                                    swap2 = user_s11;
                                    user_s11 = user_s33;
                                    user_s33 = swap2;
                                    time_swap = time1;
                                    time1 = time3;
                                    time3 = time_swap;
                                    swa= wallet1;
                                    wallet1 = wallet3;
                                    wallet3 =swa;

                                }
                                else if(Login_access.username.equals("regular4")){
                                    swap1 = user_s1;
                                    user_s1 = user_s4;
                                    user_s4 = swap1;
                                    swap2 = user_s11;
                                    user_s11 = user_s44;
                                    user_s44 = swap2;
                                    time_swap = time1;
                                    time1 = time4;
                                    time4 = time_swap;
                                    swa= wallet1;
                                    wallet1 = wallet4;
                                    wallet4 =swa;
                }
                                else if(Login_access.username.equals("regular5")){
                                    swap1 = user_s1;
                                    user_s1 = user_s5;
                                    user_s5 = swap2;
                                    swap2 = user_s11;
                                    user_s11 = user_s55;
                                    user_s55 = swap2;
                                    time_swap = time1;
                                    time1 = time5;
                                    time5 = time_swap;
                                }
            }
            else{
                System.out.println("Exchange request cancelled");
            }

        }
        else if(option==2){
            know();
            yes_no = scanner.nextLine();
            if(yes_no.equals("yes")){
                System.out.println("Exchange is successful");

                if(Login_access.username.equals("regular3")){
                    swap1 = user_s2;
                    user_s2 = user_s3;
                    user_s3 = swap1;
                    swap2 = user_s22;
                    user_s22 = user_s33;
                    user_s33 = swap2;
                    time_swap = time2;
                    time2 = time3;
                    time3 = time_swap;
                    swa= wallet2;
                    wallet2 = wallet3;
                    wallet3 =swa;
                }
                else if(Login_access.username.equals("regular4")){
                    swap1 = user_s2;
                    user_s2 = user_s4;
                    user_s4 = swap1;
                    swap2 = user_s22;
                    user_s22 = user_s44;
                    user_s44 = swap2;
                    time_swap = time2;
                    time2 = time4;
                    time4 = time_swap;
                    swa= wallet2;
                    wallet2 = wallet4;
                    wallet4 =swa;
                }
                else if(Login_access.username.equals("regular5")){
                    swap1 = user_s2;
                    user_s2 = user_s5;
                    user_s5 = swap2;
                    swap2 = user_s22;
                    user_s22 = user_s55;
                    user_s55 = swap2;
                    time_swap = time2;
                    time2 = time5;
                    time5 = time_swap;
                    swa= wallet2;
                    wallet2 = wallet5;
                    wallet5 =swa;
                }
            }
            else{
                System.out.println("Exchange request cancelled");
            }
        }
        else if(option==3){
            know();
            yes_no = scanner.nextLine();
            if(yes_no.equals("yes")){
                System.out.println("Exchange is successful");

                if(Login_access.username.equals("regular4")){
                    swap1 = user_s3;
                    user_s3 = user_s4;
                    user_s4 = swap1;
                    swap2 = user_s33;
                    user_s33 = user_s44;
                    user_s44 = swap2;
                    time_swap = time3;
                    time3 = time4;
                    time4 = time_swap;
                    swa= wallet3;
                    wallet3 = wallet4;
                    wallet4 =swa;
                }
                else if(Login_access.username.equals("regular5")){
                    swap1 = user_s3;
                    user_s3 = user_s5;
                    user_s5 = swap2;
                    swap2 = user_s33;
                    user_s33 = user_s55;
                    user_s55 = swap2;
                    time_swap = time3;
                    time3 = time5;
                    time5 = time_swap;
                    swa= wallet3;
                    wallet3 = wallet5;
                    wallet5 =swa;
                }
            }
            else{
                System.out.println("Exchange request cancelled");
            }
        }
        else if(option==4){
            know();
            yes_no = scanner.nextLine();
            if(yes_no.equals("yes")){
                System.out.println("Exchange is successful");

                if(Login_access.username.equals("regular5")){
                    swap1 = user_s4;
                    user_s4 = user_s5;
                    user_s5 = swap2;
                    swap2 = user_s44;
                    user_s44 = user_s55;
                    user_s55 = swap2;
                    time_swap = time4;
                    time4 = time5;
                    time5 = time_swap;
                    swa= wallet4;
                    wallet4 = wallet5;
                    wallet5 =swa;
                }
            }
            else{
                System.out.println("Exchange request cancelled");
            }
        }
        else{}

    }

    public void sell_list() {
        if (sell_counter == 1) {
            System.out.println("1)" + sell1.toString());
        }
        else if (sell_counter == 2) {
            System.out.println("1)" + sell1.toString());
            System.out.println("2)" + sell2.toString());
        }
        else if (sell_counter == 3) {
            System.out.println("1)" + sell1.toString());
            System.out.println("2)" + sell2.toString());
            System.out.println("3)" + sell3.toString());
        }
        else if (sell_counter == 4) {
            System.out.println("1)" + sell1.toString());
            System.out.println("2)" + sell2.toString());
            System.out.println("3)" + sell3.toString());
            System.out.println("4)" + sell4.toString());
        }
       else  {
            System.out.println("1)" + sell1.toString());
            System.out.println("2)" + sell2.toString());
            System.out.println("3)" + sell3.toString());
            System.out.println("4)" + sell4.toString());
            System.out.println("5)" + sell5.toString());
        }

    }

            public void show_time() {
                do {
                    System.out.println("""
                            PLease select a time:
                            1) 9:00 am to 12:00pm
                            2) 1:00 pm to 4:00 pm
                            3) 5:00 pm to 8:00 pm
                            4) 9:00 pm to 11:00 pm
                            Only numerical values are accepted:
                            """);
                    time = scanner.nextInt();
                    scanner.nextLine();
                    if (time <= 0 || time > 4) {
                        System.out.println("Invalid Input");
                    }
                } while (time <= 0 || time > 4);
                if (time == 1) {
                    time_show = "9:00 am to 12:00pm";
                } else if (time == 2) {
                    time_show = "1:00 pm to 4:00 pm";
                } else if (time == 3) {
                    time_show = "5:00 pm to 8:00 pm";
                } else {
                    time_show = "9:00 pm to 11:00 pm";
                }

            }
            public void wall () {
                if (seat_arr[seat_1 - 1][seat_2 - 1].equals("*")) {
                    wallet = price * 2;
                } else if (seat_arr[seat_1 - 1][seat_2 - 1].equals("@")) {
                    wallet = price * 5 / 4;
                } else if (seat_arr[seat_1 - 1][seat_2 - 1].equals("$")) {
                    wallet = price * 3 / 4;
                } else {
                    wallet = price;
                }

            }

            public void matrix () {
                for (int i = 0; i < n_size; i++) {
                    for (int j = 0; j < n_size; j++) {
                        if (i == 0) {
                            seat_arr[i][j] = "*";
                            System.out.print(seat_arr[i][j] + "\t");
                        } else if (i == (n_size - 1)) {
                            seat_arr[i][j] = "$";
                            System.out.print(seat_arr[i][j] + "\t");
                        } else if ((i > 0 && i < (n_size - 1)) && (j == index1 || j == index2)) {
                            seat_arr[i][j] = "@";
                            System.out.print(seat_arr[i][j] + "\t");
                        } else {
                            seat_arr[i][j] = "-";
                            System.out.print(seat_arr[i][j] + "\t");
                        }
                    }

                    System.out.println();
                }
            }

            public void booking () {

                len = seat_arr.length;
                index1 = (len / 2) - 1;
                index2 = len / 2;

                matrix();
                System.out.println("\nThe following are the prices of the seat\n" + "*(Executive) = " + price * 2 + "\n" + "$(Gold) = " + price * 0.75 + "\n" + "@(Diamond) = " + price * 1.25 + "\n" + "-(Platinum) = " + price);


                do {
                    System.out.println("Please select a seat, only numerical values are accepted:");
                    seat_1 = scanner.nextInt();
                    seat_2 = scanner.nextInt();
                    scanner.nextLine();
                    if ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size)) {
                        System.out.println("Invalid Input");
                    }
                } while ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size));
                wall();

                seat_arr[seat_1 - 1][seat_2 - 1] = "NA";
                for (int i = 0; i < n_size; i++) {
                    for (int j = 0; j < n_size; j++) {
                        System.out.print(seat_arr[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\nCongratulations your Booking is confirmed\n" + "Seat number: " + seat_1 + "," + seat_2 + "\n" + "Time:" + time_show + "\n" + "Date:" + current_date.format(date) + "\n" + "Wallet:" + wallet);
                count1 = 0;
                count = 0;
                exchange();
                System.out.println("Signing out......");
                input=4;
            }

            public void seat () {

                if (input == 2) {
                    int check_cancel = record();

                    if(check_cancel==0){
                        System.out.println("You have no booking to cancel");
                        return;
                    }
                    else{
                        System.out.println("Please select one of the options to cancel");
                        cancel_select = scanner.nextInt();
                        scanner.nextLine();
                    }

                    cancel_booking();


                    seat_1=0;seat_2=0;
                    exchange();
                    System.out.println("""
                            You have Successfully cancelled your Booking
                            Wallet = 0
                            """);
                } else if (input == 1) {


                    int emp = record();
                    if(emp==0){
                        System.out.println("You have no bookings to change");
                        return;
                    }
                    System.out.println("Please select which booking you want to change");
                    change_select = scanner.nextInt();
                    scanner.nextLine();
                    show_time();
                    if (seat_1 == 1) {
                        seat_arr[seat_1 - 1][seat_2 - 1] = "*";
                    } else if (seat_1 == (n_size)) {
                        seat_arr[seat_1 - 1][seat_2 - 1] = "$";
                    } else if ((seat_1 > 1 && seat_1 < (n_size)) && (seat_2 == index1 + 1 || seat_2 == index2 + 1)) {
                        seat_arr[seat_1 - 1][seat_2 - 1] = "@";
                    } else {
                        seat_arr[seat_1 - 1][seat_2 - 1] = "-";
                    }

                    for (int i = 0; i < n_size; i++) {
                        for (int j = 0; j < n_size; j++) {
                            System.out.print(seat_arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("\nThe following are the prices of the seat\n" + "*(Executive) = " + price * 2 + "\n" + "$(Gold) = " + price * 0.75 + "\n" + "@(Diamond) = " + price * 1.25 + "\n" + "-(Platinum) = " + price);
                    do {
                        System.out.println("Please select a seat, only numerical values are accepted:");
                        seat_1 = scanner.nextInt();
                        seat_2 = scanner.nextInt();
                        scanner.nextLine();
                        invert1 = Integer.toString(seat_1);
                        invert2 = Integer.toString(seat_2);
                        inversion = "("+invert1+"," + invert2+")";
                        wall();
                        exchange();
                        index();
                        if ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size)) {
                            System.out.println("Invalid Input");
                        }
                    } while ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size));

                    seat_arr[seat_1 - 1][seat_2 - 1] = "NA";
                    for (int i = 0; i < n_size; i++) {
                        for (int j = 0; j < n_size; j++) {
                            System.out.print(seat_arr[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.println("\nCongratulations your Booking is Confirmed\n" + "Seat number: " + seat_1 + "," + seat_2 + "\n" + "Time:" + time_show + "\n" + "Date:" + current_date.format(date) + "\n" + "Wallet:" + wallet);
                } else if (input == 3) {
                    Object service=null;
                    Object get_time=null;
                    Object seat_num=null;
                    Object get_price=null;
                    System.out.println("Do you want to access the list of available users?");
                    String input_sell = scanner.nextLine();
                    if(input_sell.equals("yes")){
                        Business_services.list_users();
                    }
                    int emp_1 = record();
                    if(emp_1==0){
                        System.out.println("You have no seats to sell");
                        return;
                    }

                    System.out.println("Please select the option to sell");
                    sell_select = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("How much discount you are willing to provide?");
                    discount = scanner.nextInt();
                    scanner.nextLine();
                    percentage = Integer.toString(discount);
                    dis_count = percentage + "%";
                    int list_index = data_store.indexOf(sell_select);
                    if(Login_access.username.equals("regular1")){
                        service  = data_store.get(list_index+1);
                        get_time = data_store.get(list_index+2);
                        seat_num = data_store.get(list_index+3);
                        get_price = data_store.get(list_index+4);
                    }
                    else if(Login_access.username.equals("regular2")){
                        service  = data_store2.get(list_index+1);
                        get_time = data_store2.get(list_index+2);
                        seat_num = data_store2.get(list_index+3);
                        get_price = data_store2.get(list_index+4);
                    }
                    else if(Login_access.username.equals("regular3")){
                        service  = data_store3.get(list_index+1);
                        get_time = data_store3.get(list_index+2);
                        seat_num = data_store3.get(list_index+3);
                        get_price = data_store3.get(list_index+4);
                    }
                    else if(Login_access.username.equals("regular4")){
                        service  = data_store4.get(list_index+1);
                        get_time = data_store4.get(list_index+2);
                        seat_num = data_store4.get(list_index+3);
                        get_price = data_store4.get(list_index+4);
                    }
                    if(Login_access.username.equals("regular5")){
                        service  = data_store5.get(list_index+1);
                        get_time = data_store5.get(list_index+2);
                        seat_num = data_store5.get(list_index+3);
                        get_price = data_store5.get(list_index+4);
                    }

                    price_input = Float.toString(wallet);
                    service_type();
                    num1 = Integer.toString(seat_1);
                    num2 = Integer.toString(seat_2);
                    num1 = num1 + ",";
                    num = "(" + num1 + num2 + ")";


                    System.out.println("The seat is successfully added to the sell list");
                    sell_counter++;
                    if (sell_counter == 1) {
                        sell1.put("Business Service", service);
                        sell1.put("Time:", get_time);
                        sell1.put("Seat Number", seat_num);
                        sell1.put("Discount", dis_count);
                        sell1.put("Price", get_price);
                    } else if (sell_counter == 2) {
                        sell2.put("Business Service", service);
                        sell2.put("Time:", get_time);
                        sell2.put("Seat Number", seat_num);
                        sell2.put("Discount", dis_count);
                        sell2.put("Price", get_price);
                    } else if (sell_counter == 3) {
                        sell3.put("Business Service", service);
                        sell3.put("Time:", get_time);
                        sell3.put("Seat Number", seat_num);
                        sell3.put("Discount", dis_count);
                        sell3.put("Price", get_price);
                    } else if (sell_counter == 4) {
                        sell4.put("Business Service", service);
                        sell4.put("Time:", get_time);
                        sell4.put("Seat Number", seat_num);
                        sell4.put("Discount", dis_count);
                        sell4.put("Price", get_price);
                    } else if (sell_counter == 5) {
                        sell5.put("Business Service", service);
                        sell5.put("Time:", get_time);
                        sell5.put("Seat Number", seat_num);
                        sell5.put("Discount", dis_count);
                        sell5.put("Price", get_price);
                    }
                }


                else if (input == 5) {
                    exchange();
                    System.out.println("Please select the desired option:");
                    option = scanner.nextInt();
                    scanner.nextLine();
                    option_select = Login_access.username;
                    System.out.println("The exchange request has been made successfully");
                    ex_not++;

                }
                else if(input ==6){
                    do{System.out.println("""
                            Please select to whom you you want send your message:
                            1) Users
                            2) System Admin
                            """);
                        mess_select = scanner.nextInt();
                        scanner.nextLine();
                        if(mess_select <=0 || mess_select >2){
                            System.out.println("Invalid Input");
                        }
                    }while(mess_select <=0 || mess_select >2);

                    if(mess_select ==1) {
                        note_counter++;
                        System.out.println("Please type a message,");
                        mess = scanner.nextLine();
                        notification.note();
                    }

                    else{
                        System.out.println("Please type a message,");
                        comp_mess = scanner.nextLine();
                        Admin_service.admin_complain();
                    }
                }

                else if(input == 7){
                    if(sell_counter>0) {
                            sell_list();
                        }
                    else{
                        System.out.println("The sell list is empty");
                    }
                    }

                else if(input == 8){
                    if (ex_not>0) {
                        exchange1();
                    }
                    else {
                        System.out.println("The exchange list is empty");
                    }
                }

                else if(input == 9){
                    if(note_counter>0){
                        notification.list();
                    }
                    else if(sell_counter>0){
                        notification.note();
                        notification.list();

                    }
                    else{
                        System.out.println("You do not have any notifications");
                    }
                }
                }





    public void display() {

        for (int i = 0; i < n_size; i++) {
            for (int j = 0; j < n_size; j++) {
                System.out.print(seat_arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nThe following are the prices of the seat\n" + "*(Executive) = " + price * 2 + "\n" + "$(Gold) = " + price * 0.75 + "\n" + "@(Diamond) = " + price * 1.25 + "\n" + "-(Platinum) = " + price);
        do {
            System.out.println("please select a seat, only numerical values are accepted:");
            seat_1 = scanner.nextInt();
            seat_2 = scanner.nextInt();
            scanner.nextLine();
            if ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size)) {
                System.out.println("Invalid Input");
            }
        } while ((seat_1 < 0 && seat_2 < 0) || (seat_1 < 0 || seat_2 < 0) || (seat_1 > n_size && seat_2 > n_size) || (seat_1 > n_size || seat_2 > n_size));

        wall();
        saveTimeSlot(Main.s,Login_access.username,time, seat_1);
        seat_arr[seat_1 - 1][seat_2 - 1] = "NA";
        for (int i = 0; i < n_size; i++) {
            for (int j = 0; j < n_size; j++) {
                System.out.print(seat_arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nCongratulations your Booking is confirmed\n" + "Seat number: " + seat_1 + "," + seat_2 + "\n" + "Time:" + time_show + "\n" + "Date:" + current_date.format(date) + "\n" + "Wallet:" + wallet);
        count1++;
        count++;
        int select_option1;
        exchange();
        do {
            System.out.println("""
                    \nPlease select one of the options to continue:
                    1) Exchange the Seat
                    2) Sign out
                            """);
            select_option1 = scanner.nextInt();
            scanner.nextLine();
            if (select_option1 <= 0 || select_option1 > 2) {
                System.out.println("Invalid Input");
            }
        } while (select_option1 <= 0 || select_option1 > 2);

        if(select_option1==1){
            input=5;
        }
        else if(select_option1==2){
            System.out.println("Signing out......");
        }

    }




    public void timing() {
        show();
        if(initial_select>=2 && initial_select<=8){
            return;
        }


        else {
                show_time();
        if (time == 1 && initial_select == 1) {
                if (timer1 == 0) {
                    booking();
                    storing();
                    saveTimeSlot(Main.s, Login_access.username, time, seat_1);
                    seat();
                    timer1++;
                } else {
                    booked_seat = getBooking(Main.s, Login_access.username, time);
                    if (booked_seat == 0) {
                        display();
                        storing();
                        seat();

                    } else {
                        System.out.println("Sorry you can not book more than one seat in the same time slot");
                    }
                }
            } else if (time == 2) {

                if (timer2 == 0) {
                    booking();
                    storing();
                    saveTimeSlot(Main.s, Login_access.username, time, seat_1);
                    seat();
                    timer2++;
                } else {
                    booked_seat = getBooking(Main.s, Login_access.username, time);
                    if (booked_seat == 0) {
                        display();
                        storing();
                        seat();

                    } else {
                        System.out.println("Sorry you can not book more than one seat in the same time slot");
                    }
                }

            } else if (time == 3) {

                if (timer3 == 0) {
                    booking();
                    storing();
                    saveTimeSlot(Main.s, Login_access.username, time, seat_1);
                    seat();

                    timer3++;
                } else {
                    booked_seat = getBooking(Main.s, Login_access.username, time);
                    if (booked_seat == 0) {
                        display();
                        storing();
                        seat();

                    } else {
                        System.out.println("Sorry you can not book more than one seat in the same time slot");
                    }

                }
            } else if (time == 4) {

                if (timer4 == 0) {
                    booking();
                    storing();
                    saveTimeSlot(Main.s, Login_access.username, time, seat_1);
                    seat();

                    timer4++;
                } else {
                    booked_seat = getBooking(Main.s, Login_access.username, time);
                    if (booked_seat == 0) {
                        display();
                        storing();
                        seat();

                    } else {
                        System.out.println("Sorry you can not book more than one seat in the same time slot");
                    }
                }
            }
        }
    }
    public static void saveTimeSlot(int roomType, String customerID, int timeSLot, int seatID1){
        try{
            HashMap<Integer,HashMap<String,Integer>> room = collections.getOrDefault(roomType,null);
            if(room == null){
                room = new HashMap<>();
                collections.put(roomType,room);
            }
            HashMap<String,Integer> slot = room.getOrDefault(timeSLot,null);
            if(slot == null){
                slot = new HashMap<>();
                room.put(timeSLot,slot);
            }
            int currentBookedTickets = slot.getOrDefault(customerID,0);
            if(currentBookedTickets == 0){
                slot.put(customerID,seatID1);
            }



        }catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
    public static int getBooking(int roomType, String customerID, int timeSLot){
        try{
            HashMap<Integer,HashMap<String,Integer>> room = collections.getOrDefault(roomType,null);
            HashMap<String,Integer> slot = room.getOrDefault(timeSLot,null);
            int currentBookedTickets = slot.getOrDefault(customerID,0);
            return currentBookedTickets;
        }catch (Exception e){
            System.out.println("Something went wrong!");
            return 0;
        }
    }
}




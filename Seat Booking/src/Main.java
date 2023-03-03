import java.util.Scanner;

public class Main {
    public static int s;
    public static int restrict_select,restrict;
    public static int count_1,count_2,count_3,count_4,count_5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User_services restaurant = new User_services();
        User_services cinema = new User_services();
        User_services airplane = new User_services();
        User_services conference = new User_services();
        User_services hotel = new User_services();
        Business_services dimensions = new Business_services();
        Login_access login = new Login_access();
count_1=0;count_2=0;count_3=0;count_4=0;count_5=0;
        int business_select;

        while(true) {
            s=0;
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to the Seat Booking Application");
            System.out.println(""" 
                    To Login to the System,
                    Please Select your role from the given options below:
                                    
                    1) Business Owner
                    2) System Administrator
                    3) Regular User
                    Only numerical values are accepted:
                    """);
            int n;

            String system_select="";
            int admin_select;
            do {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n <= 0 || n > 3) {
                    System.out.println("Invalid input\n" + "Please enter a valid input:");
                }
            } while (n <= 0 || n > 3);


            if (n == 1) {
                login.bl(n);
                int v;
                do {
                    login.loop();
                    v = login.access1();
                } while (v == 0);


            } else if (n == 2) {
                login.sl(n);
                int r;

                do {
                    login.loop();
                    r = login.access3();
                } while (r == 0);

            } else {

                login.ul(n);
                int val;

                do {
                    login.loop();
                    val = login.access2();
                } while (val == 0 || val==-1);
            }

            if(n!=2) {
                do {
                    System.out.println(""" 
                            \nPlease select the desired business service:
                           
                            1) Restaurant
                            2) Cinema
                            3) Airplane
                            4) Conference room
                            5) Hotel
                            Only numerical values are accepted:
                            """);
                    s = scanner.nextInt();
                    scanner.nextLine();
                    if (s <= 0 || s > 5) {
                        System.out.println("Invalid input");
                    }
                } while (s <= 0 || s > 5);
            }

            else{
                do{System.out.println("""
                        1) See the notifications
                        2) Access User details
                        3) Delete a user account
                        """);
                admin_select = scanner.nextInt();
                scanner.nextLine();
                if(admin_select<=0 || admin_select>3){
                    System.out.println("Invalid Input");
                }}while(admin_select<=0 || admin_select>3);

                if(admin_select==1){
                    if(Admin_service.comp_count>0){
                        System.out.println("You have a message from the user");
                        Admin_service.complain_list();

                    }
                    else{
                        System.out.println("You do not have any notifications");

                    }

                }

                else if(admin_select==2){
                    Admin_service.user_access();

                }

                else {
                    System.out.println("""
                            Select a user that you want to restrict from login
                            1) User1
                            2) User2
                            3) User3
                            4) User4
                            5) User5
                            """);
                    restrict_select = scanner.nextInt();
                    scanner.nextLine();
                    if(restrict_select==1){
                        restrict=1;
                        User_services.data_store=null;

                    }
                    else if(restrict_select==2){
                        restrict=2;
                        User_services.data_store2=null;
                    }
                    else if(restrict_select==3){
                        restrict=3;
                        User_services.data_store3=null;

                    }
                    else if(restrict_select==4){
                        restrict=4;
                        User_services.data_store4=null;
                    }
                    else if(restrict_select==5) {
                        restrict=5;
                        User_services.data_store5=null;
                    }


                }
            }




            if(s==2){

                switch (n) {
                    case 1:
                        do{System.out.println("""
                                1) Register a new room
                                Parameterize the room and set the regular prize of the seat
                                
                                2) See the list of available users """);
                            business_select = scanner.nextInt();
                            scanner.nextLine();
                            if(business_select<=0 || business_select>2){
                                System.out.println("Invalid Input");
                            }
                        } while(business_select<=0 || business_select>2);

                        if(business_select==1){
                            dimensions.parameter();
                            dimensions.price();}

                        else if(business_select==2){
                            dimensions.list_users();
                        }


                        break;

                    case 3:
                        cinema.timing();
                        break;

                    default:
                        System.out.print("Invalid Input");
                        break;
                }

            }
            else if(s==3){

                switch (n) {
                    case 1:
                        do{System.out.println("""
                                1) Register a new room
                                Parameterize the room and set the regular prize of the seat
                                
                                2) See the list of available users """);
                            business_select = scanner.nextInt();
                            scanner.nextLine();
                            if(business_select<=0 || business_select>2){
                                System.out.println("Invalid Input");
                            }
                        } while(business_select<=0 || business_select>2);

                        if(business_select==1){
                            dimensions.parameter();
                            dimensions.price();}

                        else if(business_select==2){
                            dimensions.list_users();
                        }


                        break;

                    case 3:
                        airplane.timing();
                        break;

                    default:
                        System.out.print("Invalid Input");
                        break;
                }

            }
            else if(s==4){

                switch (n) {
                    case 1:
                        do{System.out.println("""
                                1) Register a new room
                                Parameterize the room and set the regular prize of the seat
                                
                                2) See the list of available users """);
                            business_select = scanner.nextInt();
                            scanner.nextLine();
                            if(business_select<=0 || business_select>2){
                                System.out.println("Invalid Input");
                            }
                        } while(business_select<=0 || business_select>2);

                        if(business_select==1){
                            dimensions.parameter();
                            dimensions.price();}

                        else if(business_select==2){
                            dimensions.list_users();
                        }


                        break;

                    case 3:
                        conference.timing();
                        break;

                    default:
                        System.out.print("Invalid Input");
                        break;
                }

            }
            else if(s==5){

                switch (n) {
                    case 1:
                        do{System.out.println("""
                                1) Register a new room
                                Parameterize the room and set the regular prize of the seat
                                
                                2) See the list of available users """);
                            business_select = scanner.nextInt();
                            scanner.nextLine();
                            if(business_select<=0 || business_select>2){
                                System.out.println("Invalid Input");
                            }
                        } while(business_select<=0 || business_select>2);

                        if(business_select==1){
                            dimensions.parameter();
                            dimensions.price();}

                        else if(business_select==2){
                            dimensions.list_users();
                        }


                        break;

                    case 3:
                        hotel.timing();
                        break;

                    default:
                        System.out.print("Invalid Input");
                        break;
                }

            }

else if(s==1) {

                switch (n) {
                    case 1:
                        do{System.out.println("""
                                1) Register a new room
                                Parameterize the room and set the regular prize of the seat
                                
                                2) See the list of available users """);
                        business_select = scanner.nextInt();
                        scanner.nextLine();
                        if(business_select<=0 || business_select>2){
                            System.out.println("Invalid Input");
                        }
                        } while(business_select<=0 || business_select>2);


                        if(business_select==1){
                        dimensions.parameter();
                        dimensions.price();}

                        else if(business_select==2){
                            dimensions.list_users();
                        }

                        break;



                    case 3:
                        restaurant.timing();
                        break;

                    default:
                        System.out.print("Invalid Input");
                        break;
                }
            }

        }

    }
}
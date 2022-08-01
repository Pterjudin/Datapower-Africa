import java.sql.Time;
import java.util.Scanner;

public class flight {
String destination;
double Time;
String Type;
double price;    
String Name;
   public flight(String userdestination, 
double takeoff, 
String FlightType, 
double flightPrice,
String username) {
      destination = userdestination;
       Time = takeoff;
       Type = FlightType;
      price = flightPrice;  
      Name = username; 
}
public void  seatnumber(int seat){
   
    switch (seat) {
        case 1:
        System.out.println( " You just book sit number 1 ");
        break;
        case 2:
        System.out.println( " You just book sit number 2 ");
        break;
        case 3:
        System.out.println( " You just book sit number 3 ");
        break;
        case 4:
        System.out.println( " You just book sit number 4 ");
        break;
        case 5:
        System.out.println( " You just book sit number 5 ");
        break;
        case 6:
        System.out.println( " You just book sit number 6 ");
        break;
        default:
        System.out.println("Sit number not valid");

    }
}
    /**
     * 
     */
    public void printUserDetials(){
        System.out.print(" username is " + Name);
        System.out.print(" You will be flying in the " + Type + " Section");
        System.out.print(" And you will be leaving by " + " " + Time);
        System.out.print(" And your final destination will be " +" " + destination );
        System.out.print(" with the seat number " + seatnumber(int seat));

    }

     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        flight User = new flight("canada",
        11.00,
        "Economy", 
        2500.0, 
        "Timmy");
      
       System.out.println(User.Time);
       User.printUserDetials();
       Scanner input = new Scanner(System.in);
       System.out.print( "Put in number from value 1-6: ");
       int seatnumber = input.nextInt(); 

       input.close();

     } 
}



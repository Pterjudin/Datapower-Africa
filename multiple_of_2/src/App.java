import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);
        System.out.println(" Input your number:");
        int age =  user.nextInt();
        if (age % 2 == 0){
            System.out.println("Number is a multiple of 2");
        }else{
            System.out.println("Number is not a multiple of 2");
        }

    }
}
public class Main {
    public static void main(String[] args){
        Scanner amount = new Scanner(System.in);
        System.out.println("Deposit Amount :");
        double Deposited = amount.nextDouble();
        double removal = amount.nextDouble();
        double initial = 0.00;
        double Total = Deposited + initial;
        double withdrawal = Total - removal;
        if( Total >= withdrawal){
            System.out.println("You witdraw" + withdrawal);
        } 
        else{
            System.out.println("You cant withdraw" + withdrawal);
        }

        
        System.out.println("You deposited : " + " " + Total);
        



    }
    
}


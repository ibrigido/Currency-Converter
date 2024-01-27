import java. util.Scanner;

public class Main{

    public static void main(String[] args){

        System.out.println("1 Dollar"); 
        System.out.println("2 Pound");
        System.out.println("3 Yen");

        //take input 

        Scanner sc = new Scanner(System.in);

        //take currency as input 

        System.out.println("Choose the currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount (Greater than 1)");
        double amount = sc.nextDouble();


        //convert the amount 
         switch(choice){
            case 1: 
                Dollar_to_other(amount); 
                break;
            case 2: 
                Pound_to_other(amount);
                break; 
            case 3: 
                Yen_to_other(amount);
                break;
            default: 
                System.out.println("Invalid choice");


         }

    }

public static void Dollar_to_other(double amt){
    System.out.println(" 1 Dollar = " + .82 + " Pounds"); 
    System.out.println();

    System.out.println(amt + " Dollar = " + (amt*.82) + " Pound");
    System.out.println();

    System.out.println(" 1 Dollar = " + 149.22 + " Yen"); 
    System.out.println();

    System.out.println(amt + " Dollar = " + (amt*149.22) + " Yen");
    System.out.println();

}

public static void Pound_to_other(double amt){

    System.out.println("1 Pound = " + 1.22 + " Dollar"); 
    System.out.println();

    System.out.println(amt + " Pound = " + (amt*1.22) + " Dollar");
    System.out.println();

    System.out.println("1 Pound = " + 182.65 + " Yen");   
    System.out.println();

    System.out.println(amt + " Pound = " + (amt*182.65) + " Yen");
    System.out.println();

}

public static void Yen_to_other(double amt){
    System.out.println("1 Yen = " +  .0067 + " Dollar"); 
    System.out.println();

    System.out.println(amt + " Yen = " + (amt*.0067) + " Dollar");
    System.out.println();

    System.out.println("1 Yen = " + .0055 + " Pound"); 
    System.out.println(); 
     
    System.out.println(amt + " Yen = "+ (amt*.0055) + " Pound"); 
    System.out.println();

}


}
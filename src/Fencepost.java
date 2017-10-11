import java.util.Scanner;


//Create a program that will calculate the cost with tax of fencing a rectangular yard.
//The cost of the fencing will depend on the amount of fencing required (the perimeter of the yard), and the type of fencing used.
//Gates can are available for an additional cost.At least one gate is required.



public class Fencepost {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        double amt_fencing;//Amount of fencing per foot
        int wood_fence = 25;//Wooden fencing costs $25 per foot
        int chain_link = 15;//Chain-link fencing costs $15 per foot
        int gates = 150;//Gates cost $150 each. You must install at least one gate and can install up to 3
        int amt_gates;
        int building_permit =50;//A building permit is required. It costs $50.00.
        int lengthfeet;
        int widthfeet;
        double totalfeet;
        double totalmaterial;
        String wooden;
        String chainlink;
        double tax = .06;//The tax rate is 6.0% but it doesn't apply to the building permit
        double total;
        double subtotal;


        System.out.println("What are the length dimensons of your yard");//Ask user for length and store info
        lengthfeet=keyboard.nextInt();

        System.out.println("What are the width dimensons of your yard");//Ask user for width and store info
        widthfeet=keyboard.nextInt();

        System.out.println("What type of fence would you like to use wooden($25/ft),chain link fencing ($15/ft)");
        System.out.println("Please type w for wooden fencing ($25/ft) and c for chain link fencing ($15/ft)");
        wooden=keyboard.nextLine();
        chainlink=keyboard.nextLine();


        ///Start of If statements for choosing wooden or chain link string

        if(wooden.equalsIgnoreCase("w")){
            wooden=keyboard.nextLine();
        }else if (chainlink.equalsIgnoreCase("c")){
            chainlink=keyboard.nextLine();

        }



        System.out.println("How many Gates would you like Maximum of three");
        amt_gates= keyboard.nextInt();

        while (amt_gates>3){ //Add exception for user entering in more the 3 gates
            System.out.println("invalid answer: Please re-enter number of gates(maximum of three)");
            amt_gates= keyboard.nextInt();

        }

//Calculations based on fence selection from user

       totalfeet = lengthfeet*2 + widthfeet*2;

       amt_fencing = totalfeet*wood_fence;

       amt_fencing = totalfeet*chain_link;

       totalmaterial = amt_fencing+amt_gates;

       //Calculations for tax and building permits

        subtotal=building_permit+totalmaterial;
         total=tax+subtotal;

        System.out.println("Total :$" +total);

    }
}

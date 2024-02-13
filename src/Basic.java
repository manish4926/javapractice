import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        program2();
    }



    public static void program2() {
        //fabonnici series
        int n0 =0;
        int n1 = 1;
        int n2;
        int lenght = 10;

        System.out.print(n0+ " "+n1+" ");

        for(int i = 2; i <= lenght; i++) {
            n2 = n1+n0;
            System.out.print(n2+" ");

            n0 = n1;
            n1 = n2;
        }
    }

    public static void program1() {
        //Get Inputs from User and Print it
        System.out.println("Enter A value");
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();

        System.out.println("You hava entered "+ s + " with sum with 10 gives output of" + (s+10));

        System.out.println("Enter a sting");
        Scanner scn1 = new Scanner(System.in);
        String st  = scn1.nextLine();

        System.out.println("You have entered " + st);

    }
}

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        //program1(); //Get Inputs from User and Print it
        //program2(); //fabonnici series
        //program3(); //Java Program to Check Even or Odd Number
        //program4(); //Java Program to add two binary numbers -- program failed
        //program5(); //Multiply 2 nos
        //program6(); //Java Program to check Leap Year
        //program7(); //Java Program to check whether input character is vowel or consonant
        //program8(); //Java Program to calculate compound interest
        //program9(); //Java Program to calculate simple interest
        //program10(); //Program to find Quotient and Remainder
        program11(); // find the power of number

    }

    public static void program11() {
        int num1 = 10;
        int num2 = 5;
        long result = num1;
        for (int i = 0; i < num2-1; i++) {
            result = result * num1;
        }
        System.out.println(result);
    }

    public static void program10() {
        //Program to find Quotient and Remainder
        int num1  = 15;
        int num2  = 2;
        int quotent = num1 / num2;
        int reminder = num1 % num2;
        System.out.println(quotent);
        System.out.println(reminder);
    }

    public static void program9() {
        Scanner scn  = new Scanner(System.in);
        int principle =  scn.nextInt();
        int rate = scn.nextInt();
        int time = scn.nextInt();

        float interest = (float) ((principle * rate * time) /100);
        System.out.println(interest);
    }

    public static void program8(){
        //Java Program to calculate compound interest
        //P (1 + R/n) (nt) - P
        Scanner scn = new Scanner(System.in);
        int principle = scn.nextInt();
        float rate = ((float) scn.nextInt() /100);
        int time = scn.nextInt();

        int month = 12;

        double compoundInterest = principle * Math.pow((1 + (rate/month)) ,(month * time)) - principle;
        System.out.println(compoundInterest);

    }

    public static void program7() {
        //Java Program to check whether input character is vowel or consonant
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        char[] vowel = {'A','E','I','O','U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowel.length; i++) {
            if(ch == vowel[i]) {
                System.out.println("Its a vowel");
                return;
            }
        }
        System.out.println("Its a constant");



    }

    public static void program6() {
        // Java Program to check Leap Year
        System.out.println("Enter Year");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year % 4 == 0) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a Leap year");
        }
    }

    public static void program5() {
        // Multiply 2 nos
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int fst = scn.nextInt();
        System.out.println("Enter 2nd No.");
        int scnd = scn.nextInt();
        System.out.println("Multiply of 2 nos is : " + (fst * scnd));

    }

    public static void program4() {
        //Java Program to add two binary numbers
        //Enter 2 binary numbers
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first binary number");
        int firstBinary = 10;
        //int firstBinary = scn.nextInt();
        System.out.println("Enter second binary number");
        //int secondBinary = scn.nextInt();
        int secondBinary = 01;
        int sum[] = new int[10];
        int carry = 0;
        int i = 0;
        while(firstBinary != 0 || secondBinary != 0) {
            int fb = firstBinary % 10;
            int sb = secondBinary % 10;


            sum[i++] = (fb + sb + carry) % 2;

            System.out.println(fb + " - " + sb);
            firstBinary = firstBinary /10;
            secondBinary = secondBinary /10;
        }
        --i;
        while(i >= 0) {
            System.out.println(sum[i]);
        }


    }

    public static void program3() {
        //Java Program to Check Even or Odd Number
        Scanner scn  = new Scanner(System.in);
        int val = scn.nextInt();
        if(val%2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is a odd number");
        }
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

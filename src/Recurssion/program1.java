package Recurssion;

public class program1 {


//    public static void pxRecursive(int n) {
//
//    }
//
//    public static void px() {
//
//    }

    public static int p3Recursive(int n, int sum) {
        if(n==0) {
            return sum;
        }
        sum = sum + n;
        System.out.println(sum);
        p3Recursive(n-1, sum);
        return sum;
    }

    public static void p3() {
        //Sum of n natural numbers with recursion
        // 1+2+3+4+5+6+...n
        int n  = 10;
        int sum = 0;
        int res = p3Recursive(n, sum);
        System.out.println(res);


    }

    public static int p2Recursive(int n) {
        if(n == 0) {
            return 0;
        }

        int r = p2Recursive(n-1);
        int x = n + r;
        System.out.println("n is " +n + " and x is "+x);
        return x;
    }

    public static void p2() {
        //Fabbonicci Series
        //0 1 1 2 3 5 8 13 21 34 55
        int n = 10;
        p2Recursive(n);
    }

    public static void p1Recursive(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        n--;
        p1Recursive(n);
    }
    public static void p1() {
        //Print Value from 5 to 1
        int n = 10;
        p1Recursive(n);
    }

}

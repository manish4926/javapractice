package Recurssion;

public class program1 {


//    public static void pxRecursive(int n) {
//
//    }
//
//    public static void px() {
//
//    }

    public static void p4Recursive(int n, int fact) {
        if(n == 0 || n ==1) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        p4Recursive(n-1, fact);

    }

    public static void p4() {
        //Factorial of a number
        //fact n = n * (n-1)_* (n-2) *---1
        int n = 5;
        int fact = 1;
        p4Recursive(n, fact);
    }

    public static int p3_2Recursive(int i, int n, int sum) {
        if(i == n) {
            return sum+n;
        }
        sum += i;
        return p3_2Recursive(i+1, n, sum);

        //return sum;
    }

    public static void p3_2() {
        int n = 10;
        int i = 0;
        int sum = 0;
        int result = p3_2Recursive(i, n, sum);
        System.out.println(result);
    }

    public static int p3Recursive(int n, int sum) {
        if(n==0) {
            return 0;
        }
        sum = p3Recursive(n-1, sum);
        sum += n;

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

    public static void p2Recursive(int n1, int n2, int n, int sum) {
        if(n == 0) {
            sum  = n1 + n2;
            System.out.print(sum+" ");
            return;
        }
        //System.out.println(n1+ "--"+n2);
        sum  = n1 + n2;
        //System.out.println(n);
        System.out.print(sum+" ");
        n--;
        p2Recursive(n2, sum, n, sum);

    }

    public static void p2() {
        //Fabbonacci Series
        //0 1 1 2 3 5 8 13 21 34 55
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1+ " ");
        System.out.print(n2+ " ");
        p2Recursive(n1, n2, n-2, sum);
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

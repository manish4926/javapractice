public class Patterns {

    //Box Print
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        pattern7();

    }

    public static void pattern7() {
        int size = 5;

        //Method 1
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size-row-1; col++) {
                System.out.print("   ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(" * ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Method 2
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size-row-1; col++) {
                System.out.print("   ");
            }
            for (int col = 0; col <= 2*row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void pattern6() {
        int size = 4;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(col < size-row-1) {
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }

            }

            System.out.println(" ");
        }
    }

    public static void pattern5() {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size-row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    public static void pattern4() {
        int size = 5;

        for (int row = 0; row < size; row++) {
            for (int col = size-row; col > 0; col--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern3() {
        int size = 15;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        int x = 5;
        int y = 5;

        for(int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                if(row == col || col+row==x-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern1() {
        int x = 5;
        int y = 5;

        for(int i  =0 ; i< x ; i++) {
            for (int j = 0; j < y; j++) {
                if(i == 0 || i == x-1 || j == 0 || j == y-1) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }
    }
}

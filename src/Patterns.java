public class Patterns {

    //Box Print
    public static void main(String[] args) {

//        pattern1();
//        System.out.println();
//        pattern2();
//        System.out.println();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
        Patterns p= new Patterns();
        //p.pattern8();
        //p.pattern8();
        //p.pattern9();
        //p.pattern10();
        //p.pattern11();
        //p.pattern12();
        //p.pattern13();
        p.pattern14();



    }

    void pattern14() {
        int size = 4;
        
        System.out.println("not decided");
    }

    void pattern13() {
        int size = 5;
        int val = 1;
        int[][] matrix = new int[5][5];
        int totalMatrixSize = size*size;
        int iteration = size-1;
        String direction = "right";
        int x = 0;
        int y = 0;
        for (int i = 0; i < totalMatrixSize; i++) {
            switch (direction) {
                case "right":
                    matrix[x][y] = val;
                    if(y == iteration) {
                        direction = "down";
                        x++;
                    } else {

                        y++;
                    }
                    break;
                case "down":
                    matrix[x][y] = val;
                    if(x == iteration) {
                        direction = "left";
                        y--;
                    } else {
                        x++;
                    }
                    break;
                case "left":
                    matrix[x][y] = val;
                    if(y == 0) {
                        direction = "up";
                        x--;
                    } else {

                        y--;
                    }
                    break;
                case "up":
                    matrix[x][y] = val;
                    if(x == size-iteration) {
                        direction = "none";
                        y++;
                    } else {
                        x--;
                    }
                    break;
            }
            val++;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(matrix[i][j] != 0) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    void pattern12() {
        //https://static.javatpoint.com/corebasic/programs/images/java-program-to-print-the-following-pattern-4.png
        int size = 7;
        int val = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j || i+j == size-1) {

                    System.out.print(val);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            if(i <= size/2 -1) {
                val++;
            } else {
                val--;
            }
        }
    }

    void pattern11() {
//        1
//        2 4
//        3 6 9
//        4 8 12 16
//        5 10 15 20 25
//        6 12 18 24 30 36
//        7 14 21 28 35 42 49
//        8 16 24 32 40 48 56 64
//        9 18 27 36 45 54 63 72 81
//        10 20 30 40 50 60 70 80 90 100
        int size = 10;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    void pattern10() {
//        *000*000*
//        0*00*00*0
//        00*0*0*00
//        000***000


        int cols = 9;
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == j || j == cols-i-1 || j == (cols/2)) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    void pattern9() {
//        5432*
//        543*1
//        54*21
//        5*321
//        *4321

        int totalVal = 5;
        for (int i = 0; i < totalVal; i++) {
            for (int j = totalVal; j > 0; j--) {
                if(i == j-1) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }

            }
            System.out.println();

        }

    }

    void pattern8() {

        int maxtrixSize = 10;
        int[][] matrix = new int[maxtrixSize][maxtrixSize];
        int fullMatrixSize = maxtrixSize * maxtrixSize;
        String direction = "right";
        int singleIteration  = maxtrixSize-1;
        int x = 0;
        int y = 0;
        int val = 1;

        for (int i = 0; i < fullMatrixSize; i++) {

            matrix[x][y] = val;

            switch (direction) {
                case "right":
                    // move to y with x = 0
                    if(y == singleIteration) {
                        direction = "down";
                        x++;
                    } else {
                        y++;
                    }
                    break;

                case "down":
                    // move to x with y = 0
                    if(x == singleIteration) {
                        direction = "left";
                        y--;
                    } else {
                        x++;
                    }
                    break;
                case "left":
                    // move left to y with x same value
                    if(y == maxtrixSize - singleIteration - 1) {
                        direction = "up";
                        x--;
                    } else {
                        y--;
                    }
                    break;
                case "up":
                    // move left to y with x same value
                    if(x == maxtrixSize - singleIteration) {
                        direction = "right";
                        y++;
                        singleIteration--;
                    } else {
                        x--;
                    }
                    break;
            }
            val++;

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
        int size = 5;

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

public class Recursion {

    static int n2;
    static int count = 10;
    static int n0 = 0;
    static int n1 = 1;
    public static void main(String[] args) {
        //Fabonnici
        fabonnici();
    }

    public static void fabonnici() {
        recurFabonnici(count);
    }

    static void recurFabonnici(int count)
    {
        n2 = n1 + n0;
        System.out.print(n2 + " ");
        n0 = n1;
        n1 = n2;
        
    }
}

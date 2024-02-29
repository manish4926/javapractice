import java.lang.reflect.Array;

public class Sorting {

    public static void main(String[] args) {
        Sorting st = new Sorting();
        //st.program1(); //bubble sort
        st.program2(); //selection sort
    }

    public void program2() {
        int[] arr = {7,8,3,1,2};
        String type = "greater";
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            switch (type) {
                case "greater":
                    int greatest = i;
                    for (int j = 0; j < arr.length-1-i; j++) {
                        if(arr[j] > arr[j+1]) {
                            greatest = i;
                        }
                    }
                    temp = arr[greatest];
                    arr[greatest] = arr[i];
                    arr[i] = temp;
                    break;

                case "smaller":
                    int smallest = i;
                    for (int j = i+1; j < arr.length; j++) {
                        if(arr[smallest] > arr[j]) {
                            smallest = j;
                        }
                    }
                    temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;

                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public void program1() {
        int[] arr = {7,8,3,1,2};
        String type = "smaller";
        //int[] arr1 = new int[arr.length];
        //Time Complexity = 0(n^2) //Not a good approach
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            switch (type) {
                case "greater":
                    for (int j = i; j < arr.length-1; j++) {
                        if(arr[j] < arr[j+1]) {
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                    break;

                case "smaller":
                    for (int j = 0; j < arr.length-1-i; j++) {
                        if(arr[j] > arr[j+1]) {
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }

                    //Check Iteration
//                    for (int n = 0; n < arr.length; n++) {
//                        System.out.print(arr[n]+ " ");
//
//                    }
//                    System.out.println();
                    break;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }




}

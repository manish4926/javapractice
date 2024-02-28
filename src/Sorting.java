import java.lang.reflect.Array;

public class Sorting {

    public static void main(String[] args) {
        Sorting st = new Sorting();
        st.program1(); //bubble sort
    }

    public void program1() {
        int[] arr = {7,8,3,1,2};
        String type = "smaller";
        //int[] arr1 = new int[arr.length];
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

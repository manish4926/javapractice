public class Test {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++) {
            System.out.println(nums[i] );
            if((nums[i] + nums[i+1]) == target) {
                int i1 = i + 1;
                int[] arr = {i, i1};
                return  arr;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        Test t = new Test();
        int[] x = t.twoSum(arr, 12);
//        if(x.length > 2) {
//            System.out.println(x[0] + "-"+ x[1]);
//        } else {
//            System.out.println("Target not match");
//        }


    }


}

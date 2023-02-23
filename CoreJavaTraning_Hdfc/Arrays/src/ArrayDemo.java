public class ArrayDemo {

    public static void main(String[] args) {
        int[] nums = {12, 42, 34, 54, 33, 23};
        int [] arr = new int[4];

        System.out.println(arr);
        arr[0] = 101;
        arr[1] = 102;
        System.out.println(nums);

        for (int r1:arr) {
            System.out.println(r1);
        }
        for (int x1 : nums) {
            System.out.println(x1);
        }
            MultiArray();
    }

    public static void MultiArray(){
        int [][] arr1 = {{1,2,4},{2,3}};
        System.out.println(arr1[0]);

        int [][] arr2 = new int[3][];
        System.out.println(arr2[0]);
    }
}

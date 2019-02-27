package ro.jademy.math;

public class Math {


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 6};

        System.out.println(sum(arr1));

        System.out.println(sum(new int[]{1, 2, 3, 4, 6, 10}));
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}

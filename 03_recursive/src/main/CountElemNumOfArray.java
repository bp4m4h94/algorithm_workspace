package main;

public class CountElemNumOfArray {

    public static void main(String[] args) {
        Object[] arr = {"ddd","ee","e","apple"};
        int num = count(arr);
        System.out.println(num);
    }

    private static int count(Object[] arr) {
        if (arr == null) {
            return 0;
        }
        return 1 + count(arr);
    }
}

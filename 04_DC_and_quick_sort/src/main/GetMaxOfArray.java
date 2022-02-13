package main;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GetMaxOfArray {

    public static void main(String[] args) {

        Integer[] arr = {1, 4, 66, 7, 8, 78};
        List<Integer> intList = Arrays.asList(arr);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(intList);

        int max = max(stack);
        System.out.println(max);
    }

    private static int max(Stack<Integer> stack) {
        Integer head = stack.remove(0);
        if (stack.isEmpty()) {
            return head;
        }
        int max = max(stack);
        if (head > max) {
            return head;
        } else {
            return max;
        }
    }
}

package main;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {

    public static void main(String[] args) {

        Integer[] arr = {1,23,4,33,4,5,6};
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        Stack<Integer> result = quickSort(stack);
        System.out.println(result);
    }

    private static Stack<Integer> quickSort(Stack<Integer> stack) {
        if (stack.size() < 2) {
            return stack;
        }
        Integer pivot = stack.get(0);
        stack.remove(pivot);

        Stack<Integer> less = new Stack<>();
        Stack<Integer> greater = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        stack.forEach(e -> {
            if (e < pivot) {
                less.add(e);
            } else {
                greater.add(e);
            }
        });
        ans.addAll(quickSort(less));
        ans.add(pivot);
        ans.addAll(quickSort(greater));
        return ans;
    }
}

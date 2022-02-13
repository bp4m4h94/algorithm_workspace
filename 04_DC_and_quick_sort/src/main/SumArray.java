package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumArray {
    public static void main(String[] args) {
        Integer[] array = {3, 4, 5, 7};
        int total = sumEleOfArray(array);
        System.out.println(total);
    }

    private static int sumEleOfArray(Integer[] array) {
        List<Integer> list = new LinkedList<>(Arrays.asList(array));
        if (list.size() == 0) {
            return 0;
        }
        Integer head = list.get(0);
        list.remove(head);
        return head + sumEleOfArray(list.toArray(new Integer[list.size()]));
    }
}

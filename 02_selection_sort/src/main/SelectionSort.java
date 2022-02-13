package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 3, 42, 56, 234));
        System.out.println(getSortedArray(list));
    }


    public static List<Integer> getSortedArray(List<Integer> list) {
        List<Integer> ans = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer small = findSmallest(list);
            ans.add(small);
            list.remove(small);
        }
        return ans;
    }

    public static int findSmallest(List<Integer> list) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (result > list.get(i)) {
                result = list.get(i);
            }
        }
        return result;
    }
}

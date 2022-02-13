package main;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(43);
        myList.add(44);

        System.out.println(myList);
        Integer ans = binarySearch(myList, 44);
        System.out.println(ans);
    }

    public static Integer binarySearch(List<Integer> list, Integer item) {

        int lowest = 0;
        int highest = list.size() - 1;

        while (highest >= lowest) {
            int mid = (lowest + highest) / 2;
            int guess = list.get(mid);
            if (guess == item) {
                return mid;
            } else if (guess < item) {
                lowest = mid + 1;
            } else {
                highest = mid - 1;
            }
        }
        return null;
    }
}

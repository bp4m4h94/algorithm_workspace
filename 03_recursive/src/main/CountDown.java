package main;

public class CountDown {

    public static void main(String[] args) {
        countDown(3);
    }

    private static void countDown(int from) {
        if (from < 0) {
            return;
        }
        System.out.println(from);
        from--;
        countDown(from);
    }
}

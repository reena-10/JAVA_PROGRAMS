package static_keyword;

class Counter {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}


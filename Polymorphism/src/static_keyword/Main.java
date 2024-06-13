package static_keyword;

public class Main {
    public static void main(String[] args) {
        // Create three Counter objects
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        // Call increment() method on each object
        for (int i = 0; i < 5; i++) {
            counter1.increment();
            counter2.increment();
            counter3.increment();
        }

        // Print the final value of count
        System.out.println("Final count value: " + Counter.getCount());
    }
}

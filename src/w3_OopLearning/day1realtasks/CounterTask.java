package w3_OopLearning.day1realtasks;

public class CounterTask {
    public static void main(String[] args) {

        Counter counter = new Counter(10);
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getValue());
    }


}

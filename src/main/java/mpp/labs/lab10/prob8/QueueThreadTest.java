package mpp.labs.lab10.prob8;

public class QueueThreadTest {
    public static void main(String[] args){
        Queue queue = new Queue();

    }

    public static void multipleCalls(Queue queue) {
        Runnable r = () -> {
            for(int i = 0; i < 5000; ++i) {
                queue.add(i);
            }
        };
        for(int i = 0; i < 1000; ++i) {
            new Thread(r).start();
        }
    }
}

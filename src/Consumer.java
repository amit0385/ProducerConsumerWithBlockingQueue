import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<String> blockingQueue;
    public Consumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String element = this.blockingQueue.take();
                System.out.println("Consumed - "+element);
                //System.out.println("Draining all element from queue, so that consumer can wait");
                //this.blockingQueue.drainTo(new ArrayList<String>());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

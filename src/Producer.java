import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<String> blockingQueue;
    public Producer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
        while (true) {
            long timeInMillis = System.currentTimeMillis();
            try {
                System.out.println("Putting element - "+timeInMillis);
                this.blockingQueue.put(""+timeInMillis);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

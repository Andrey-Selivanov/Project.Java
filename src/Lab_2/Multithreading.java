package Lab_2;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Multithreading {
    static int MAX_SIZE = 10;
    static BlockingQueue queue = new LinkedBlockingQueue(MAX_SIZE);
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
    }

    static class Producer extends Thread {
        Random random = new Random();
        public void run() {
            while(true){
                int element = random.nextInt(MAX_SIZE);
                try{
                    Thread.sleep(100);
                    queue.put(element);
                    System.out.println("Producer " + String.valueOf(element));
                } catch (InterruptedException e) {
                }
            }
        }
    }

    static class Consumer extends Thread {
        public void run() {
            while(true) {
                try{
                    Thread.sleep(100);
                    System.out.println("Consumed" + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

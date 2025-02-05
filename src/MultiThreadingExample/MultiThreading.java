package MultiThreadingExample;

public class MultiThreading {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            // For Class Threading extends "Runnable" Interface
            Threading thread = new Threading(i);
            Thread mythread = new Thread(thread);
            mythread.start();

//          // For Class Threading extends "Thread" Class
//            Threading thread = new Threading(i);
//            thread.start();
        }
//        Threading thread2 = new Threading();
//        Threading thread3 = new Threading();
////        thread.join();
//        thread2.start();
//        thread3.start();

    }
}

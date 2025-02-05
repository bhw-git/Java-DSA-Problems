package MultiThreadingExample;

//public class Threading extends Thread{
//    private final int threadNumber;
//    public Threading(int threadNumber){
//        this.threadNumber = threadNumber;
//    }
//    public void run() {
//        if (threadNumber == 1) {
//            throw new RuntimeException();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i + " from thread " + threadNumber);
////        try{
////            Thread.sleep(1000);
////        }
////        catch (Exception e){
////            System.out.println(e.getMessage());
////        }
//            }
//    }
//}

public class Threading implements Runnable{
    private final int threadNumber;
    public Threading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        }
    }

}

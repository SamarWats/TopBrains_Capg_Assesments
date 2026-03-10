package ThreadsQuestions;

public class Timer implements Runnable{
    public static void main(String[] args) {
        System.out.println("Start Timer");
        Runnable r = new Timer();
        r.run();
    }
    @Override
    public void run() {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        try {
            while (true) {
                Thread.sleep(2000);
                seconds += 10;
                minutes += seconds / 60;
                hours += minutes / 60;
                seconds %= 60;
                minutes %= 60;
                System.out.println("Timer: "+hours+":"+minutes+":"+seconds);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

//public class Timer implements Runnable{
//	
//    @Override
//    public void run() {
//    	int second=0;
//        while (true) {
//            try {
////                System.out.println("Timer refreshed at: " + java.time.LocalTime.now());
//                Thread.sleep(10000);
//                second += 10;
//                System.out.print("\nAfter 10 second: "+ second);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Timer obj = new Timer();
//        Thread t1 = new Thread(obj);
//
//        t1.start();
//    }
//}
package thread;

public class test2Runnable {
    public static void main(String[] args) {

        Ra ra = new Ra();
        new Thread(ra).start();
        new Thread(ra).start();
        new Thread(ra).start();
        new Thread(ra).start();

    }
}

class Ra implements Runnable {
    private int a = 4003;

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("线程号:" + Thread.currentThread().getName() + " 数字:" + a);
            a--;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (i % 10 == 0)
//                System.out.println();
        }

    }
}

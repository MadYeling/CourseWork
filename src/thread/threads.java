package thread;

public class threads {

    public static void main(String[] args) {
        PrintThread tr1 = new PrintThread();
        tr1.start();
        PrintThread tr2 = new PrintThread();
        tr2.start();

        PrintRunnable pr = new PrintRunnable();
        new Thread(pr).start();
        new Thread(pr).start();
    }
}

class PrintThread extends Thread {

    @Override
    public void run() {
        int j;
        if (Thread.currentThread().getName().equals("Thread-0")) {
            j = 5;
        } else {
            j = 10;
        }
        for (int i = 0; i < j; i++) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在运行");
        }
    }

}

class PrintRunnable implements Runnable {

    @Override
    public void run() {
        int j;
        if (Thread.currentThread().getName().equals("Thread-2")) {
            j = 5;
        } else {
            j = 10;
        }
        for (int i = 0; i < j; i++) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在运行");
        }
    }

}
package thread;

public class test1Thread {
    public static void main(String[] args) {

        Tr tr = new Tr();
        tr.start();

        for (int i = 0; i <= 10000; i++) {
            System.out.print("执行main中的循环 ");
            if (i % 10 == 0)
                System.out.println();
        }

    }
}

class Tr extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.print("执行线程中的循环 ");
            if (i % 10 == 0)
                System.out.println();
        }
    }
}

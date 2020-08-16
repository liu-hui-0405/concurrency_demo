/**
 * @ClassName SynchronizedClassClass5
 * @Description 类锁的第二种形式，synchronized(*.class)代码块
 * @Author lh
 * @Date 2020-08-16 15:37
 **/
public class SynchronizedClassClass5 implements Runnable {

    static SynchronizedClassClass5 instance1 = new SynchronizedClassClass5();

    static SynchronizedClassClass5 instance2 = new SynchronizedClassClass5();

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }

    @Override
    public void run() {
        method();
    }

    private void method() {
        synchronized (SynchronizedClassClass5.class) {
            System.out.println("类锁的第二种形式,synchronized(*.class),name : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
    }
}

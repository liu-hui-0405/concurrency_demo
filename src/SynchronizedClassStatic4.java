/**
 * @ClassName SynchronizedClassStatic4
 * @Description 类锁的第一种形式，static形式
 * @Author lh
 * @Date 2020-08-16 15:25
 **/
public class SynchronizedClassStatic4 implements Runnable {

    static SynchronizedClassStatic4 instance1 = new SynchronizedClassStatic4();

    static SynchronizedClassStatic4 instance2 = new SynchronizedClassStatic4();

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

    public static synchronized void method() {
        System.out.println("类锁的第一种形式,static形式,name : " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
}

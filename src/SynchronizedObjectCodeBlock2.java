/**
 * @ClassName: SynchronizedObjectCodeBlock2
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/8/14
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/14
 * @UpdateRemark: 对象锁示例1，代码块形式
 */
public class SynchronizedObjectCodeBlock2 implements Runnable{

    static SynchronizedObjectCodeBlock2 instance =  new SynchronizedObjectCodeBlock2();
    Object lock1 = new Object();
    Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("finished");
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("对象锁代码块形式, name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", 运行结束");
        }
        //synchronized (lock1) {
        //    System.out.println("lock1, name: " + Thread.currentThread().getName());
        //    try {
        //        Thread.sleep(3000);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //    System.out.println(Thread.currentThread().getName() + ", lock1运行结束");
        //}
        //synchronized (lock2) {
        //    System.out.println("lock2, name: " + Thread.currentThread().getName());
        //    try {
        //        Thread.sleep(3000);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //    System.out.println(Thread.currentThread().getName() + ", lock2运行结束");
        //}
    }
}

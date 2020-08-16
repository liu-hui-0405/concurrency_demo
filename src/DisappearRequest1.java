/**
 * @ClassName: DisappearRequest1
 * @Description: 消失的请求数
 * @Author: LH
 * @CreateDate: 2020/8/14
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/14
 * @UpdateRemark: UpdateRemark
 */
public class DisappearRequest1 implements Runnable {

    static DisappearRequest1 instance =  new DisappearRequest1();

    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }

    // @Override
    // public void run() {
    //     for (int j = 0; j < 100000; j++) {
    //         i++;
    //     }
    // }

    /**
     * 对象锁：方法锁
     */
    // @Override
    // public synchronized void run() {
    //     for (int j = 0; j < 100000; j++) {
    //         i++;
    //     }
    // }

    /**
     * 对象锁：同步代码块
     */
    // @Override
    // public void run() {
    //     synchronized (this) {
    //         for (int j = 0; j < 100000; j++) {
    //             i++;
    //         }
    //     }
    // }

    /**
     * 类锁：static形式
     */
    // @Override
    // public void run() {
    //     synchronized (DisappearRequest1.class) {
    //         for (int j = 0; j < 100000; j++) {
    //             i++;
    //         }
    //     }
    // }

    /**
     * 类锁：synchronized(*.class)
     */
    @Override
    public void run() {
        method();
    }

    public static synchronized void method() {
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }
}

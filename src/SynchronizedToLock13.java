import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: SynchronizedToLock13
 * @Description: 加锁释放锁等价代码
 * @Author: LH
 * @CreateDate: 2020/8/17
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/8/17
 * @UpdateRemark: UpdateRemark
 */
public class SynchronizedToLock13 {
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        SynchronizedToLock13 synchronizedToLock13 = new SynchronizedToLock13();
        synchronizedToLock13.method1();
        synchronizedToLock13.method2();
    }

    public synchronized void method1() {
        System.out.println("Synchronized形式的锁");
    }

    public void method2() {
        lock.lock();
        try {
            System.out.println("lock形式的锁");
        } finally {
            lock.unlock();
        }
    }
}

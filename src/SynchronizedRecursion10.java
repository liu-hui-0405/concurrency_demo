/**
 * @ClassName SynchronizedRecursion10
 * @Description 可重入粒度测试：递归调用本方法
 * @Author lh
 * @Date 2020-08-16 22:34
 **/
public class SynchronizedRecursion10 {

    int a = 0;

    public static void main(String[] args) {
        SynchronizedRecursion10 instance = new SynchronizedRecursion10();
        instance.method();
    }

    private synchronized void method() {
        System.out.println("我是method, a = " + a);
        if (a == 0) {
            a++;
            method();
        }
    }
}

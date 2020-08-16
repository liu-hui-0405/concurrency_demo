/**
 * @ClassName SynchronizedRecursion10
 * @Description 可重入粒度测试：调用类内另外的方法
 * @Author lh
 * @Date 2020-08-16 22:34
 **/
public class SynchronizedOtherMethod11 {


    public static void main(String[] args) {
        SynchronizedOtherMethod11 instance = new SynchronizedOtherMethod11();
        instance.method1();
    }

    private synchronized void method1() {
        System.out.println("我是method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("我是method2");
    }
}

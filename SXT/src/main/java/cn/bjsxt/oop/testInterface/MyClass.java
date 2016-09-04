package cn.bjsxt.oop.testInterface;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class MyClass implements MyInterface {
    public void test01() {

    }

    public int test02(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.printf(MyClass.MAX_JOB);
    }
}

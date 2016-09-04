package cn.bjsxt.oop.polymophism.myServlet;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class Test {
    public static void main(String[] args) {
        HttpServlet s = new MyServlet();
        s.doGet();
        s.service();
    }
}

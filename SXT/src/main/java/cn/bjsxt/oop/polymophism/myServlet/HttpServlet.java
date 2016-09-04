package cn.bjsxt.oop.polymophism.myServlet;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class HttpServlet {
    public void service() {
        System.out.println("HttpServlet.service()");
        this.doGet();
    }

    public void doGet() {
        System.out.println("HttpServlet.doGet()");
    }

}

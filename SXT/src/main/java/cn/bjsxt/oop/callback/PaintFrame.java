package cn.bjsxt.oop.callback;

import java.awt.*;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class PaintFrame {
    public static void drawFrame(MyFrame f) {
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");
        //
        f.paint();

        System.out.println("启动缓存， 增加效率");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame01());
        System.out.println("============");
        drawFrame(new GameFrame02());
    }
}


class GameFrame01 extends MyFrame {
    @Override
    public void paint() {
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
class GameFrame02 extends MyFrame {
    @Override
    public void paint() {
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }
}

package cn.bjsxt.oop.abstractClass;

/**
 * Created by maxuecai on 2016/9/3.
 */
public abstract class Animal {
    public abstract void run() ;
    public  void sleep(){
        run();
    }
}

class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("here you are run");
    }

}

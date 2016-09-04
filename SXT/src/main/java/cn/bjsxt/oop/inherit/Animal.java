package cn.bjsxt.oop.inherit;

/**
 * Created by maxuecai on 2016/9/1.
 */
public class Animal {
    String eye;

    public void run() {
        System.out.println("≈‹≈‹!");
    }

    public void eat() {
        System.out.println("≥‘≥‘£°");
    }

}

class Mammal extends Animal {

    @Override
    public void run() {
        System.out.println("Mammal.run");
    }

    public void tarsheng() {
        System.out.println("wo shi tai sheng");
    }
}

class Paxing extends Animal{


    public void aggSheng() {
        System.out.println("luan sheng");
    }
}

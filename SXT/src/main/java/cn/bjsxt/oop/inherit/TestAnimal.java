package cn.bjsxt.oop.inherit;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Mammal();
        animal.run();

      /*  Mammal animal2 = (Mammal)animal;
        animal2.tarsheng();
*/
        ((Mammal) animal).tarsheng();
        ((Mammal)animal).tarsheng();
    }
}

package cn.bjsxt.oop.innerClass;

/**
 * Created by maxuecai on 2016/9/3.
 */
public class Outer {
    public static void main(String[] args) {
        Face.Nose nose = new Face().new Nose();
        nose.breath();
        Face.Ear ear = new Face.Ear();
        ear.listen();
    }
}

class Face{
    int type;
    class Nose{
        String type;
        void breath() {
            System.out.println("Nose.breath");
            System.out.println(Face.this.type);
        }
    }

    static class Ear{
        void listen() {

            System.out.println("I am listen.");
        }
    }
}



package cn.bjsxt.oop.testThis;

/**
 * Created by maxuecai on 2016/9/1.
 */
public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name +" ѧУ");
    }

    public void sayHello(String sname) {
        System.out.println(name +"��" + sname + "˵����ã�");
    }


}

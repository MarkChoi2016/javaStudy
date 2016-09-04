package cn.bjsxt.oop.myCollection;

import java.util.Objects;

/**
 * Created by maxuecai on 2016/9/4.
 */
public class MyArrayList {

    //The value is used for object storage.
    private Object[] value;

    //the size is number of Objects used.
    private int size;

    public int size() {
        return this.size;
    }
    public MyArrayList(int size) {
        value = new Object[size];
    }

    public MyArrayList() {
        this(16);
    }

    public void add(Object obj){
        value[size] = obj;
        size++;
        if (size>=value.length) {
            int newCapacity = value.length*2;
            Object[] newList = new Object[newCapacity];
            //System.arraycopy();
            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }
            value = newList;
        }
    }

    @Override
    public String toString() {
      return   super.toString();
    }

    public Object get(int index) {
        return value[index];
    }

    public int indexOf(Object o){
        if (o==null) {
            return -1;
        } else {
            for (int i = 0; i < value.length; i++) {
                if (o==value[i])
                    return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(1);
        list.add("aaa");
        list.add(new Human("baoqi"));
        list.add("bbb");

        System.out.println(list.get(0));
        Human h = (Human)list.get(1);
        System.out.println(h.name);
        System.out.println(list.size());
        System.out.println(list.indexOf("bbb"));
    }
}

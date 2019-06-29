package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * package homework;
 * <p>
 * /**
 * * 自测下ArrayList与LinkedList在你本地的机器上的性能
 * *
 * * 主要是验证 LinkedList是不是所有数据都是删除和修改最快
 * *
 * * @author haoc
 */

public class topic1 {
    public static void main(String[] args) {
        ArrayList();
        linkedlist();
    }


    public static void ArrayList() {
        ArrayList al = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            al.add(0, "加入元素" + i);//注意
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList添加消耗的时间" + (end - start));


        start = System.currentTimeMillis();
        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList删除消耗的时间" + (end - start));

    }

    public static void linkedlist() {
        LinkedList al = new LinkedList();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            al.add(0, "加入元素" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("LinkedList添加消耗的时间" + (end - start));


        start = System.currentTimeMillis();

        Iterator iterator=al.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList删除消耗的时间" + (end - start));

    }


}

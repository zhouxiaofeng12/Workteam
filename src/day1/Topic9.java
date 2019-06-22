package day1;//作业9 练习数组的定义,赋值,和初始化.使用int型即可

public class Topic9 {
    public static void main(String[] args) {
        toArrayList();
    }


    public static void toArrayList() {
        //java中的数据必须先初始化才能使用
        //数组类型,初始化一个数组 方法1
        int[] a = new int[1000];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //迭代器
        int[] b = {1, 2, 3, 4, 5};
        for (int i : b) {
            System.out.println(a[i]);
        }

        //赋值
        int[] c = new int[10];
        c[0] = 12;
        c[1] = 23;
        c[3] = 33;
        c[4] = 43;
        c[5] = 3;
        c[6] = 83;
        c[7] = 53;
        c[8] = 33;
        c[9] = 13;

        double total = 0.0;
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
    }


}

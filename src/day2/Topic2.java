package day2;

/**
 * 输出1到100以内的所有质数
 * <p>
 * 质数: 只能被1和自身整除的数,如3,7,11,13等
 *
 * @author haoc
 */

public class Topic2 {
    public static void main(String[] args) {
        Prime_number();
    }


    public static void Prime_number() {
        int j;
        //写了一个循环
        for (int i = 3; i <= 100; i++) {
            j = 2;
            while (i % j != 0) {
                j++;
            }

            //为啥做这个判断哈
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}

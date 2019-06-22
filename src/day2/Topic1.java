package day2;

/**
 * 作业1: 实现99乘法表
 * <p>
 * 输出:
 * 1*1=1
 * 1*2=2	2*2=4
 * 1*3=3	2*3=6	3*3=9
 * 1*4=4	2*4=8	3*4=12	4*4=16
 * 1*5=5	2*5=10	3*5=15	4*5=20	5*5=25
 * 1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36
 * 1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49
 *
 * @author haoc
 */

public class Topic1 {
    public static void main(String[] args) {
        Clc_disp();
    }

    public static void Clc_disp() {
        for (int col = 1; col < 10; col++) {
            System.out.println("");
            for (int row = 1; row < 10; row++) {
                if(col >= row){
                    System.out.print(row + "*" + col + "=" + row * col+"\t");
                }
            }
        }

    }


}

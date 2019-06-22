package day2;

import java.util.Scanner;


/**
 * 作业5:实现一个杨辉三角
 * <p>
 * 要求: 打印多少行由方法入参传入
 * <p>
 * 杨辉三角的样式:
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 2 3 2 1
 * 1 2 3 5 3 2 1
 *
 * @author haoc
 */

public class Topic5 {
    public static void main(String[] args) {
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        func(10);
    }


    public static void func(int n) {
        if (n < 0) return;
        int[][] arr = new int[n][n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

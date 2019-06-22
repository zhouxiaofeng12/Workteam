package day1;/*
基于9中定义的数组,实现数组内容的二分查找,查找一个给定的元素
 */

public class Topic11 {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 77, 89, 90};
        search(arr, 44);
    }

    public static int search(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (num < arr[middle]) {
                end = middle - 1;
            } else if (num > arr[middle]) {
                start = middle + 1;
            } else {
                System.out.println(middle);
                return middle;
            }
        }
        System.out.println("----无法找到中间的数值----");
        return -1;
    }
}

package day1;/*
基于9中定义的数组,实现数组内容的基本排序,冒泡即可
 */

public class Topic10 {
    public static void main(String[] args) {
        sortedListing();

        //TODO 这个字符串数组要排序吗
    }


    public static void sortedListing() {
        int tmp = 0;
        int[] sortList = {100, 12, 45, 1, 245, 30, 56};
        for (int i = 0; i < sortList.length; i++) {
            for (int j = i; j < sortList.length - 1; j++) {
                if (sortList[i] > sortList[j + 1]) {
                    tmp = sortList[i];
                    sortList[i] = sortList[j + 1];
                    sortList[j + 1] = tmp;
                }

            }

        }
        for (int i = 0; i < sortList.length; i++) {
            System.out.println(sortList[i]);
        }

    }

}

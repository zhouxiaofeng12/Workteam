package day1;/*
4.实现字符串右空格trim,例:字符串"   adb   ",输出"   adb"
 */

public class Topic4 {
    public static void main(String[] args) {
        rightTrim("  122 ");
        rightTrim(null);
        rightTrim("12");
        rightTrim(" ");
        rightTrim(" 12121212    ");
    }


    /*
  判断是空
   */
    public static boolean accurateCheck(String num1) {

        if ((num1 == null)) {
            return false;
        }

        if (num1.trim().isEmpty()){
            return false;
        }

        return true;
    }


    public static void rightTrim(String s) {
        String b = "";
        int index = 0;

        if (!accurateCheck(s)) {
            System.out.println("传入的内容为空");
            return;
        }


        char[] charArray = s.toCharArray();
        for (index = charArray.length - 1; index > 0; index--) {
            if (charArray[index] != ' ') {
                break;
            }

        }

        for (int w = 0; w < index + 1; w++) {
            b += charArray[w] + "";
        }
        System.out.println(b);
    }

}

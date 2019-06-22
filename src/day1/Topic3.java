package day1;//作业3 实现字符串左空格trim,例.字符串"   adb   ",输出"abc   "

public class Topic3 {
    public static void main(String[] args) {
        leftTrim(" abc");
        leftTrim(" 12 ");
        leftTrim(" 2qqqq ");
        leftTrim(null);
        leftTrim("   adc");
    }


    /*
判断是空
 */
    public static boolean accurateCheck(String num1) {

        if ((num1 == null)) {
            return false;
        }

        if (num1.trim().isEmpty()) {
            return false;
        }

        return true;
    }


    public static void leftTrim(String s) {
        String b = "";
        int index = 0;

        if (!accurateCheck(s)) {
            System.out.println("输入内容为空");
            return;
        }

        char[] charArray = s.toCharArray();
        for (index = 0; index < charArray.length; index++) {
            if (charArray[index] != ' ') {
                break;
            }
        }

        for (int w = index; w < charArray.length; w++) {
            b += charArray[w] + "";
        }
        System.out.println(b);
    }
}

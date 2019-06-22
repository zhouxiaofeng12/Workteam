package day1;//作业5
//实现字符串左右指定字符的trim,例:字符  "***adb***",输出"adb",干掉"*"

public class Topic5 {
    public static void main(String[] args) {
        replaceString("***adb***","*");
        replaceString("***adb***","--");
        replaceString("122adb1221","1");

        //TODO 实际字符串里面的1不能替换,怎么保证就替换左右的啊

    }

    public static void replaceString(String s, String replaceChar) {
        if (!s.contains(replaceChar)){
            System.out.println("你要替换的内容不在字符串中包含");
            return;
        }

        char[] charsArray = s.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            String temp = String.valueOf(charsArray[i]);
            if (temp.equals(replaceChar)) {
                charsArray[i] = ' ';
            }
        }

        System.out.println(new String(charsArray).trim());
    }

}

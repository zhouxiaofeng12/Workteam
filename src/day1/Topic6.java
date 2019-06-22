package day1;//作业6 基于startWith,实现可忽略大小写的实现,即 abc_和ABC_皆可以
/*
adbc adb
adbc 123
 */

public class Topic6 {
    public static void main(String[] args) {
        checkStart("abcd", "ABCDEF");
        checkStart("abcd", "ab");
        checkStart("AC", "ac");
        checkStart("cdw", "ABC");
        checkStart("", "ABC");
        checkStart("a", "aaaaa");
        checkStart("null", "aaaaa");
    }


    public static boolean checkIsempty(String inputString) {
        if (inputString.trim().length() == 0) {
            return false;
        }
        if (inputString == "null"){
            return false;
        }
        return true;
    }

    public static void checkStart(String inputString, String replaceString) {
        /*
        case1:如果存在输入字符为空的情况
        case2:如果存在输入字符为""的情况
         */
        if (!checkIsempty(inputString) || !checkIsempty(replaceString)) {
            System.out.println("字符为空");
            return;
        }

        if (inputString.startsWith(replaceString.toLowerCase()) || inputString.startsWith(replaceString.toUpperCase())) {
            System.out.println("对比字符相同");
        } else {
            System.out.println("对比字符不同");
        }
    }
}

package day1;

//作业7 基于endWith,实现可忽略大小写的实现,即 abc_和ABC_皆可以
public class Topic7 {
    public static void main(String[] args) {
        // 第二个参数,是否在第一个参数的结尾
        checkStart("immu","U");
        checkStart("12","12_");
        checkStart("12_","_");
        checkStart("This is really not immutable!!","immutable!!");
        checkStart("adbc_","ADBC_");
        checkStart("adbc_","ADBC_");
        checkStart("真的","的");
        checkStart(" ","的");
    }

    public static boolean checkIsempty(String inputString) {
        if (inputString.trim().length() == 0) {
            return false;
        }
        if (inputString == "null") {
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
            System.out.println("字符不能为空,无法比较,请重新输入参数");
            return;
        }

        if (inputString.endsWith(replaceString.toLowerCase()) || inputString.endsWith(replaceString.toUpperCase())) {
            System.out.println("对比字符相同");
        } else {
            System.out.println("对比字符不同");
        }
    }
}

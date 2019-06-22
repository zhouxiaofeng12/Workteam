package day1;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_DOWN;

/*
 * 作业1: 使用BigDecimal写一个计算器,实现加减乘除,考虑可能很大的数值计算场景
 */

public class Topic1 {
    public static void main(String[] args) {
//        counterAdd("12", "12");
//        counterAdd(".12", "12");
//        counterAdd("12.", "12");
//        counterAdd("faff", "12");
//        counterAdd("4", "12");
//        counterAdd(null, "12");
//        counterAdd(null, "12");
//        counterSub("9f", "12");
//        counterMul("9", "12");
//        counterMul("1", "1");
//        counterMul("0", "1");
////        counterMul("2", "-2");
//        counterDivide("1", "0");
//        counterDivide("1", "2");
//        counterDivide("1", "3");
//        counterDivide("1", "3.2");
    }

    /*
    判断是空
     */
    public static boolean checkTrim(String num1, String num2) {

        if ((num1 == null) || (num2 == null)) {
            return true;
        }

        if ((num1.trim().isEmpty()) || (num2.trim().isEmpty())) {
            return true;
        }

        return false;
    }

    /*
    字符判断,判断是否是1~9中间的值,是否含有'-'和'.'
    */
    public static boolean checkIsNumbers(String num) {
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= '0' && chars[i] <= '9') || (chars[i] == '.') || (chars[i] == '-')) {
                continue;
            }
            return false;
        }
        return true;
    }

    /*
    精确判断具体的值
     */
    public static boolean checkExactly(String num) {
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //判断-在第一位
            if (chars[i] == '-' && i != 0) {
                return false;
            }

            //判断.不在第一位
            if (chars[0] == '.' || chars[chars.length - 1] == '.') {
                return false;
            }

        }
        return true;
    }

    /*
       长度很大的数值计算场景
    */
    public static boolean checkBigNum(String num) {
        if (num.length() > 0 && num.length() < 12) {
            return true;
        } else {
            System.out.println("数字的长度太大了");
            return false;
        }
    }

    public static boolean checkLegal(String num1,String num2) {
        /*
        进行基本判断,判断不为空
         */
        if (checkTrim(num1, num2)) {
            System.err.println("参数异常,两个数其中一个为空");
            return false;
        }

        /*
        判断长度最大值
         */
        if (!checkBigNum(num1) || !checkBigNum(num2)) {
            System.err.println("参数异常,两个数长度超过了最大限制");
            return false;
        }

        if (!checkIsNumbers(num1) || !checkIsNumbers(num2)) {
            System.err.println("需要输入正确的数字类型");
            return false;
        }

        if (!checkExactly(num1) || !checkExactly(num2)) {
            System.err.println("请输入正确的格式");
            return false;
        }

        return true;

    }

    public static void counterSub(String num1, String num2) {

        if (!checkLegal(num1,num2)){
            return;
        }

        /*
        转换BigDecimal类型
         */
        BigDecimal aDecimal = new BigDecimal(num1.trim());
        BigDecimal bDecimal = new BigDecimal(num2.trim());
        String c = aDecimal.subtract(bDecimal).toString();
        System.out.println(c);

    }


    public static void counterAdd(String num1, String num2) {
        if (!checkLegal(num1,num2)){
            return;
        }
        /*
        转换BigDecimal类型
         */
        BigDecimal aDecimal = new BigDecimal(num1.trim());
        BigDecimal bDecimal = new BigDecimal(num2.trim());
        String c = aDecimal.add(bDecimal).toString();
        System.out.println(c);

    }

    public static void counterMul(String num1, String num2) {
        if (!checkLegal(num1,num2)){
            return;
        }
        /*
        转换BigDecimal类型
         */
        BigDecimal aDecimal = new BigDecimal(num1.trim());
        BigDecimal bDecimal = new BigDecimal(num2.trim());
        String c = aDecimal.multiply(bDecimal).toString();
        System.out.println(c);

    }

    public static void counterDivide(String num1, String num2) {
        if (!checkLegal(num1,num2)){
            return;
        }

        //判断分母不能为0
        if ("0".equals(num2)){
            System.out.println("分母不能为0");
            return;
        }

        /*
        转换BigDecimal类型
         */
        BigDecimal aDecimal = new BigDecimal(num1.trim());
        BigDecimal bDecimal = new BigDecimal(num2.trim());
        String c = aDecimal.divide(bDecimal,3,ROUND_HALF_DOWN).toString();
        System.out.println(c);

    }

}

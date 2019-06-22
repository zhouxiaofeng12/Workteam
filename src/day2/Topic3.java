package day2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 作业3: 实现一个计算器
 * <p>
 * 需求如下:
 * <p>
 * - 1.接收客户端输入(Java核心卷一,第三章,3.7节)的三个数据,格式: 数据1 操作符 数据2,如: 1 + 2
 * <p>
 * - 2.如果数据1和2是数值型,则进行相应的运算符操作
 * <p>
 * - 3.如果数据1和2不是数值型,则将数据1和数据2按字符串处理,与运算符一起拼接后输出,如: abc - bcd,输出"abc-bcd"
 * <p>
 * 备注:
 * <p>
 * - 1.计算器运算符只支持+,-,*,/,%
 * <p>
 * - 2.数据和运算符之间使用空格隔开
 * <p>
 * 要求:
 * <p>
 * - 1.考虑程序的健壮性
 * <p>
 * - 2.自行设计测试用例
 *
 * @author haoc
 */

public class Topic3 {
    public static void main(String[] args) {
        counter();
    }


    public static boolean isDigitCheck(String inputNum) {
        boolean unique = false;
        char[] chars = inputNum.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[0] == '-') {
                continue;
            }
            if (chars[i] == '.' && i == 0) {
                return false;
            }

            if (chars[i] == '.' && !unique) {
                unique = true;
                continue;
            }

            if (chars[i] == '.' && unique) {
                return false;
            }

            if (!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }


    public static boolean checkOperator(String inputNum) {
        char[] chars = inputNum.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '+' && chars[i] != '-' && chars[i] != '*' && chars[i] != '/' && chars[i] != '%') {
                throw new IllegalArgumentException("输入的运算符错误");
            }
        }
        return true;
    }


    public static String checkValues(String inputNum1, String inputNum2, String count) {
        BigDecimal result_all;
        String result_end;

        //判断分母不能为0
        if (("0".equals(inputNum2) && count.equals("/"))) {
            throw new IllegalArgumentException("除数不能为0");
        }


        BigDecimal aDecimal = new BigDecimal(inputNum1);
        BigDecimal bDecimal = new BigDecimal(inputNum2);
        if (count.equals("+")) {
            result_all = aDecimal.add(bDecimal);
        } else if (count.equals("-")) {
            result_all = aDecimal.subtract(bDecimal);
        } else if (count.equals("*")) {
            result_all = aDecimal.multiply(bDecimal);
        } else if (count.equals("/")) {
            result_all = aDecimal.divide(bDecimal);


        } else if (count.equals("%")) {
            result_all = aDecimal.multiply(bDecimal);
        } else {
            throw new IllegalArgumentException("输入的运算符错误");
        }

        result_end = result_all.toString();
        System.out.println(result_end);
        return result_end;
    }


    public static String checkStringValues(String inputNum1, String inputNum2, String count) {
        String result_end;

        result_end = inputNum1+" "+ count +" "+ inputNum2;
        System.out.println(result_end);
        return result_end;
    }


    /**
     * 判断是空,0的情况
     */
    public static boolean checkTrim(String num1, String num2) {

        if ((num1 == null) || (num2 == null)) {
            return true;
        }

        if (num1.trim().isEmpty()) {
            return true;
        }

        return false;
    }

    public static void counter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数值:");
        String inputNum1 = scanner.nextLine();

        System.out.print("请输入第二个数值:");
        String inputNum2 = scanner.nextLine();

        System.out.print("两个数之间的运算是:");
        String count = scanner.nextLine();

        if (checkTrim(inputNum1, inputNum2)) {
            throw new IllegalArgumentException("输入的数值错误,为0或者为null");
        }


        /**
         * 如果整数的情况下
         */
        if (isDigitCheck(inputNum1) & isDigitCheck(inputNum2) & checkOperator(count)) {
            checkValues(inputNum1, inputNum2, count);
        } else{
            checkStringValues(inputNum1, inputNum2, count);
        }
    }
}
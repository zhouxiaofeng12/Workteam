package day1;

/*
实现toTitle() 转换,即"hello"输出"Hello"
 */
public class Topic8 {
    public static void main(String[] args) {
//        toTitle("hello");
//        //如果本身就是大写那
//        toTitle("Eello");

        //输入的不是字符咋办
        toTitle("abs1");

//        //输入参数为空白和null
//        toTitle(" ");
//        toTitle(null);
    }


    public static boolean ischar(String inputString){
        char[] chars =inputString.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='0' && chars[i]<'9'){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }


    public static boolean checkIsempty(String inputString) {
        if (inputString == null) {
            System.err.println("入参不可为null");
            return false;
        }else if (inputString.trim().length() == 0) {
            return false;
        }else if (inputString.trim() == "null") {
            return false;
        }

        return true;
    }



    //作业8 实现toTitle()转换,即:"hello"输出"Hello"
    public static String toTitle(String input) {
        char word;
        String resultReplace ="";

        if (!checkIsempty(input)){
            System.out.println("输入参数为null或者空白,无法转换");
            resultReplace="输入参数为null或者空白";
            return resultReplace;
        }

        if (!ischar(input)){
            System.err.println("输入非英文字母内容");
            resultReplace="输入非英文字母内容";
            return resultReplace;
        }


        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                word = (char) (input.toLowerCase().charAt(i) - 32);
                resultReplace += word;
            } else {
                resultReplace += input.charAt(i);
            }
        }
        System.out.println(resultReplace);
        return resultReplace;
    }


}

package day3;

//计算出从键盘输入的字符串中各字母出现的次数

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Topic1 {
    public static void main(String[] args) {
        Map<String,Integer> mapCount=new HashMap<>();

        System.out.println("请输入要对比的字符:");
        Scanner scanner=new Scanner(System.in);
        char[] input=scanner.next().toCharArray();
        String input_content=scanner.nextLine().toString();
        int count=1;

        for (int i = 0; i < input.length ; i++) {
            String vsput=String.valueOf(input[i]);
            if (mapCount.containsKey(vsput)){
                mapCount.put(vsput,mapCount.get(vsput)+1);
            }else{
                mapCount.put(vsput,1);
            }
        }
        
        //便利
        for (String key: mapCount.keySet()){
            System.out.print(key+"("+mapCount.get(key)+")");
        }
    }


}

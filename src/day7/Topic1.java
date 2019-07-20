package day7;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 回顾之前的一个作业, day02/homework.Topic11
 * <p>
 * 从文件取出数据之后,将数据放到数据库中去,
 * <p>
 * 注: 注意代码的健壮性 以及 编写相应的测试用例
 * <p>
 * 要求: 经过几天的代码编写, 请尽量用一些设计的手段进去
 *
 * @author haoc
 */
public class Topic1 {
    private static final String URL = "jdbc:mysql://localhost:3306/cakes";
    private static final String USER_NAME = "root";
    private static final String PASSWD = "123456";

    public static void main(String[] args) {

        //获取数据
        ArrayList fileList = getFile();
        insertDB(fileList);

    }

    /**
     * 获取文件数据,返回一个map文件
     */
    public static ArrayList getFile() {
        ArrayList<Map<String, String>> dataArray = new ArrayList<>();
        FileInputStream fs = null;
        try {
            //1.定义文件读取流
            fs = new FileInputStream("/Users/wangshijie/Documents/BestTest/Workteam/src/day7/getResult");

            InputStreamReader isr = new InputStreamReader(fs);
            BufferedReader br = new BufferedReader(isr);

            String line = "";

            while ((line = br.readLine()) != null) {
                HashMap<String, String> dataHashMap = new HashMap<>();
                String[] split = line.split(" ");
                //放到map里面
                dataHashMap.put("name", split[0].trim());
                dataHashMap.put("id", split[1].trim());
                dataHashMap.put("address", split[2].trim());

                //增加到list中
                dataArray.add(dataHashMap);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(dataArray);
        return dataArray;

    }

    /**
     * insert数据库
     */
    public static void insertDB(ArrayList arrayList){
        //便利出来数据
        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

            //insert数据库

        }


    }
}

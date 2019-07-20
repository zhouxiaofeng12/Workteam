package day4;
/*
package homework;

/**
 * 作业11: I/O + 集合 + 对象 练习题
 *
 * 文件: 位置随意,数据格式: id, name, gender, score, address
 *
 * 读取出数据之后,放到对象中User
 *
 * 在将User放入集合中
 *
 * 集合中的User,按照address,gender,分组,且每个组内的分数还要排序
 *
 * - 如: 北京,男 ; 上海,女
 *
 * @author haoc
 */

/**
 * 考虑的点是哪里:
 * 1.基础I/0,集合
 * 2.健壮性
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class topic3 {
    public static void main(String[] args) {
        readView();
    }


    public static void readView() {
        BufferedReader reader = null;
        User user = null;
        HashMap<String, User> userHash = new HashMap<>();

        // 2.定义文件读取流
        // 使用BufferedReader时,就这里不同
        try {
            // 1.文件描述

            File file = new File("/Users/wangshijie/Documents/BestTest/Workteam/src/day4/testdemo.txt");

            // 2.定义文件读取流
            // 使用BufferedReader时,就这里不同
            reader = new BufferedReader(new FileReader(file));

            // 3.文件读取
            String val = null;
            while ((val = reader.readLine()) != null) {
                String[] valList = val.split(",");
                //4.设置值
                for (int i = 0; i < valList.length; i++) {
                    user = new User(valList[0], valList[1], valList[2], valList[3], valList[4]);
                    userHash.put(valList[0], user);
                }
            }

            //5.集合中的User,按照address,gender,分组,且每个组内的分数还要排序
            //按地址分组
            HashMap<String, ArrayList> addressHash = new HashMap();

            for (Map.Entry entry : userHash.entrySet()) {
                user = (User) entry.getValue();
                if (addressHash.containsKey(user.address)) {
                    addressHash.get(user.address).add(user);
                } else {
                    ArrayList<User> arrayList = new ArrayList();
                    arrayList.add(user);
                    addressHash.put(user.address, arrayList);
                }
            }
            ArrayList array = new ArrayList();
            for (Map.Entry<String, ArrayList> entry : addressHash.entrySet()) {
                array = entry.getValue();
                Collections.sort(array, new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        if (new Integer(o1.getScore()) > new Integer(o2.getScore())) {
                            return 1;
                        }
                        return -1;
                    }
                });

                System.out.println(array);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            // 4.关流
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void sortGrades(HashMap<String, ArrayList> hashMap) {
        for (Map.Entry<String, ArrayList> entry : hashMap.entrySet()) {
            ArrayList arrayList = entry.getValue();
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList);
            }
        }
    }
}

class User {
    String id;
    String name;
    String gender;
    String score;
    String address;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public User(String id, String name, String gender, String score, String address) {
        //调用User 上面的构造方法
        this(id,name,gender);
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getScore() {
        return score;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score='" + score + '\'' +
                ", address='" + address + '\'' +
                '}' + '\n';
    }


}

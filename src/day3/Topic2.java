package day3;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//定义一个Map,key是userId,value是User,要求便利整个Map的数据
//User{String userId,String name,int age,Map<String,List<String>>hobby}
public class Topic2 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("周凤");
        user.setUserID("u001");
        user.setAge(28);
        user.addMapHooby("文学", "金瓶梅", "红楼梦", "不知道");
        user.addMapHooby("测试", "测试指南", "测试开发", "测试之美");
//        user.getMap();
        System.out.println(user);

        user.setName("王某某");
        user.setUserID("u002");
        user.setAge(49);
        user.addMapHooby("文学", "1", "2", "3");
        user.addMapHooby("测试", "测试指南", "测试开发", "测试之美");
//        user.getMap();
        System.out.println(user);
    }

}

class User {
    String userID;
    String name;
    int age;
    List<String> hobbyList = new ArrayList<>();
    Map<String, List<String>> hobbyMap = new HashMap<>();

    public User(){

    }

    public User(String userID, String name,int age){
        this.userID = userID;
        this.name = name;
        this.age = age;
    }


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void addMapHooby(String key, String hooby1, String hooby2, String hooby3) {
        List listTmp = new ArrayList();
        listTmp.add(hooby1);
        listTmp.add(hooby2);
        listTmp.add(hooby3);
        hobbyMap.put(key, listTmp);
    }

    public Map<String, List<String>> getMap() {
        System.out.println(hobbyMap);
        return hobbyMap;
    }

    @Override
    public String toString() {
        return "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + hobbyMap;
    }
}


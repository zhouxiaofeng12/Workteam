package day3;

import java.util.*;

public class Topic4 {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        User user2 = new User();

        ArrayList<User> arrayList = new ArrayList<>();

        user.setName("周凤");
        user.setUserID("u001");
        user.setAge(28);
        user.addMapHooby("文学", "金瓶梅", "红楼梦", "不知道");
        user.addMapHooby("测试", "测试指南", "测试开发", "测试之美");

        user1.setName("王某某");
        user1.setUserID("u002");
        user1.setAge(49);
        user1.addMapHooby("文学", "1", "2", "3");
        user1.addMapHooby("测试", "测试指南", "测试开发", "测试之美");

        user2.setName("邓小花");
        user2.setUserID("u003");
        user2.setAge(49);
        user2.addMapHooby("电影", "1", "2", "3");
        user2.addMapHooby("唱歌", "测试指南", "测试开发", "测试之美");

        arrayList.add(user);
        arrayList.add(user1);
        arrayList.add(user2);

        groupHobby(arrayList);

    }

    public static void groupHobby(ArrayList<User> arrayList) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            System.out.println(arrayList.get(i).hobbyMap);
            System.out.println(arrayList.get(i).hobbyMap.keySet());

            //分组
            Set<String> s = arrayList.get(i).hobbyMap.keySet();
            Iterator<String> iterator = s.iterator();

            while (iterator.hasNext()) {
                ArrayList<String> arrayList1 = new ArrayList<>();

                String key = iterator.next();
                System.out.println(key);
                if (hashMap.containsKey(key)) {
                    arrayList1 = hashMap.get(key);
                    arrayList1.add(arrayList.get(i).name);
                    hashMap.put(key, arrayList1);
                } else {
                    arrayList1.add(arrayList.get(i).name);
                    hashMap.put(key, arrayList1);
                }

            }


        }

        System.out.println(hashMap);

    }
}

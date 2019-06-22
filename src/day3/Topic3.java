package day3;

import day3.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topic3 {

    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList();

        User user = new User("ID01","周梓墨",24);
        User user1 = new User("ID02","周凤",24);
        User user2 = new User("ID03","周xxx凤",25);


        list.add(user);
        list.add(user1);
        list.add(user2);

        ageCount(list);


    }


    public static void ageCount(ArrayList<User> list) {
        //年纪分组要求1
        Map<String, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String vsput = String.valueOf(list.get(i).getAge()) + "岁";
            if (mapCount.containsKey(vsput)) {
                mapCount.put(vsput, mapCount.get(vsput) + 1);
            } else {
                mapCount.put(vsput, 1);
            }
        }
        System.out.println(mapCount);
    }



}




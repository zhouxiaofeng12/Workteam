package day2;

import java.util.*;

/**
 * 作业10: 集合作业(需要提前学习下 List,Map等基本用法)
 * <p>
 * - 定义一个对象,User,属性有 name,age,score,gender
 * <p>
 * - 使用集合ArrayList,来装一批User, 数据可以随意
 * <p>
 * - 要求1: 遍历集合,打印所有内部数据
 * <p>
 * - 要求2: 按照年纪(age)进行分组,比如23岁,有3个人, 24岁有5个人,
 * <p>
 * - 要求3: 按照分数(score)范围分组, 比如 60-70, 有一组人, 70-80有一组人
 * <p>
 * - 要求4: 基于分数排序, 由高到低
 * <p>
 * - 要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
 *
 * @author haoc
 */
public class Topic10 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        User user = new User("周梓墨", 3, 60, "女");
        User user1 = new User("周凤", 6, 76, "女");
        User user2 = new User("周某某", 6, 70, "男");
        User user3 = new User("李莎莎", 3, 90, "女");
        User user4 = new User("你傻", 6, 50, "女");
        User user5 = new User("你才傻", 6, 78, "男");
        User user6 = new User("你才傻2", 6, 78, "男");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);


//
//        //便利要求1
//        for (User userCount:list) {
//            System.out.println(userCount);
//        }

        //便利要求1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        //年纪分组要求1
        Map<String, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < list.size() ; i++) {
            String vsput=String.valueOf(list.get(i).age);
            if (mapCount.containsKey(vsput)){
                mapCount.put(vsput+"岁",mapCount.get(vsput)+1);
            }else{
                mapCount.put(vsput+"岁",1);
            }
        }
        System.out.println(mapCount);


        //年龄分组要求1
        Map<String, Integer> mapScore = new HashMap<>();
        for (int i = 0; i < list.size() ; i++) {
            int vsput=list.get(i).score;
            if (60 <= vsput && (vsput <= 70)){
                if (mapScore.containsKey("第一组")){
                    mapScore.put("第一组",mapScore.get("第一组")+1);
                }else{
                    mapScore.put("第一组",1);
                }
            }else if (80 >= vsput && vsput >70){
                if (mapScore.containsKey("第二组")){
                    mapScore.put("第二组",mapScore.get("第二组")+1);
                }else{
                    mapScore.put("第二组",1);
                }
            }else{
                if (mapScore.containsKey("其他")){
                    mapScore.put("其他",mapScore.get("其他")+1);
                }else{
                    mapScore.put("其他",1);
                }
            }
        }
        System.out.println(mapScore);


        //要求4: 基于分数排序, 由高到低
        Collections.sort(list);
        System.out.println(list);



        //要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
        List listFemale=new ArrayList();
        List listMale=new ArrayList();
        int  Femalescore=0;
        int  Maleescore=0;


        for (int i = 0; i < list.size() ; i++) {
            String vsput=String.valueOf(list.get(i).gender);
            if (vsput.equals("女")){
                listFemale.add(list.get(i).score);
            }else{
                listMale.add(list.get(i).score);
            }
        }
        System.out.println(listFemale);
        System.out.println(listMale);


        for (int i = 0; i <listFemale.size(); i++) {
            Femalescore+=(Integer) listFemale.get(i);
        }

        for (int i = 0; i <listMale.size(); i++) {
            Maleescore+=(Integer) listMale.get(i);
        }

        System.out.println("男的平均分"+(Femalescore/listFemale.size()));
        System.out.println("女的平均分"+(Maleescore/listMale.size()));


    }






}

/**
 *    Collections.sort(list);
 *
 *    Comparator  Comparable
 */
class User implements Comparable<User>{
    protected String name;
    protected int age;
    protected int score;
    protected String gender;

    public User(String name, int age, int score, String gender) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", gender='" + gender + '\'' +
                '}';
    }


    @Override
    public int compareTo(User o) {
        //比较都用他 topic10
        if (this.score > o.score){
            return 1;
        }
        return -1;
    }
}
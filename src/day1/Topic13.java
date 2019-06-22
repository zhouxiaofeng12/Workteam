package day1;

//基于面向对象的预习,定义一个类User,要求具备
/*
--a.有私有属性
--b.有公开属性
--c.有默认的构造方法
--d.有重载1个或者2个参数的构造方法
--e.有方法,只需实现获取属性值即可
--f.有类属性(静态域)
--g.有类方法(静态方法)
--h.对User对象进行实例化,并调用其方法(e步骤实现)
 */
public class Topic13 {


    public static void main(String[] args) {
        User user=new User(12);
        user.setWeight("130");
        //静态方法,对象都是类级别,不能用对象的
        User.play();
        System.out.println(user.getAge());
        System.out.println(user.weight);
    }

    static class User {
        private int age;
        public String weight;

        public User() {
        }

        public User(int age) {
            this.age = age;
        }

        public User(String weight) {
            this.weight = weight;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public static void play(){
            System.out.println("我要玩游戏");
        }

    }

}


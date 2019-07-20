//package day4;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 1.先拆解,找到每一步之间的依赖关系
// * 2.针对具体的每一步进行逐个实现
// * 3.
// */
//
//
///**
// * 1.读取文件数据
// * <p>
// * 2.对数据进行解析
// * <p>
// * 3.入库
// */
//
//public class topic3_twice {
//    public static void main(String[] args) {
//        //1.读取文件数据
//        List<String> fileDate = readFile("/Users/wangshijie/Documents/BestTest/Workteam/src/day4/testdemo.txt");
//
//        //2.
//
//        //3.
//    }
//
//
//    /**
//     * 抛出来问题的时候,有归类
//     * 写代码的时候要有思路,1,2,3
//     * 写的时候要有思路 第一个返回值,给第二个函数的入参,然后第二个返回值,要给第三个人
//     */
//
//    private static List<String> readFile(String path) {
//        //1.list 自动扩容,满了就往上加
//        //默认可以给一个值,这样可以不让他反复扩容
//        BufferedReader reader;
//        List<String> result = new ArrayList<>();
//
//        //2.无
//        File file = new File(path);
//
//
//        class User {
//            private String name;
//            private int age;
//            private String address;
//
//            public User() {
//            }
//
//            public User(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//
//            public User(String name, int age, String address) {
//                this(name, age);
//                this.address = address;
//            }
//
//            @Override
//            public String toString() {
//                return "User{" +
//                        "name='" + name + '\'' +
//                        ", age=" + age +
//                        ", address='" + address + '\'' +
//                        '}';
//            }
//        }

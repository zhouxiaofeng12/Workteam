package day2.Topic8;

/**
 * 作业8: 回想下面向对象练习的时候,我们设计的老师类和学生类,好多重复的属性和方法
 *
 * - 使用面向对象中的继承来抽象老师和学生更高一层的类,父类
 *
 * - 让相同的属性和方法可以抽离到父类中
 *
 * @author haoc
 */
public class Topic8 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("周凤");
        student.setAge(28);
        student.setWeight("116");

        student.getName();
        student.getAge();
        student.getWeight();

        System.out.println("=================================================================");

        Teacher teacher=new Teacher();
        teacher.setName("王某某");
        teacher.setAge(28);
        teacher.setWeight("130");

        teacher.getName();
        teacher.getAge();
        teacher.getWeight();

    }

}


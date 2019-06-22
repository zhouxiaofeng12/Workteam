package day2;


/**
 * 作业7: 老师在黑板画圆
 * <p>
 * 要求: 按照面向对象的思想设计
 * <p>
 * - 老师不一定只会画圆,还可能会画正方形
 * <p>
 * - 老师也可能会画大脸猫
 * <p>
 * - 老师不见得只会在黑板上画,也可以在纸上画
 * <p>
 * - 黑板只能用来画圆吗? 黑板还可以做题的
 * <p>
 * - 圆形,也不是随便画的, 它还有圆心,有半径
 * <p>
 * ----- 思考以上问题,在来设计, 看不懂的就多想想,让自己想5遍以上,如果还是想不明白,再来问老师
 *
 * @author haoc
 */


/**
 * 2个对象,老师,画
 */
public class Topic7 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Draw draw=new Draw();

        teacher.setAge(25);
        teacher.setName("周老师");
        draw.setScene("书本上");
        draw.setDrawCircle("画圆");
        System.out.println(teacher.getName()+draw.getScene()+draw.getDrawCircle());



        teacher.setName("王老师");
        draw.setScene("黑板");
        draw.setDrawCircle("画方形");
        System.out.println(teacher.getName()+draw.getScene()+draw.getDrawCircle());
    }

}

class Teacher {
    private int age;
    private String name;

    public Teacher() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Draw {
    private String drawCircle;
    private String scene;

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getDrawCircle() {
        return drawCircle;
    }

    public void setDrawCircle(String drawCircle) {
        this.drawCircle = drawCircle;
    }


}
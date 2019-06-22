package day2;

/**
 * 作业9: 请用面向对象的思路设计: 马路上跑汽车
 * <p>
 * - 马路: 可能是告诉, 也可能是辅路,还可能是乡村公路
 * <p>
 * - 汽车: 可能是宝马, 可能是奔驰, 还可能是奥拓
 * <p>
 * - 请用多态来进行设计
 *
 * @author haoc
 */
public class Topic9 {
    public static void main(String[] args) {
        Car car = new bmwCar();
        car.setBrand();
        Sence rode = new CountryRoad();
        car.run(rode);

        Car car1 = new benchiCar();
        car1.setBrand();
        Sence rode1 = new CountryRoad();
        car.run(rode1);


    }
}

class Car {
    protected String brand;
    protected String run;

    public void setBrand() {
        this.brand = brand;
        System.out.println(this.brand);
    }

    public String run(Sence sence) {
        System.out.println(brand + "跑在" + sence.setSence());
        return brand + "跑在" + sence.setSence();
    }

}


class bmwCar extends Car {
    public bmwCar() {
        brand = "宝马";
    }
}

class benchiCar extends Car {
    public benchiCar() {
        brand = "奔驰";
    }
}

class Sence {
    protected String sence;

    public String setSence() {
        this.sence = sence;
        return sence;
    }
}

class Highway extends Sence {
    public Highway() {
        sence = "公路";
    }
}

class CountryRoad extends Sence {
    public CountryRoad() {
        sence = "乡间小路";
    }
}


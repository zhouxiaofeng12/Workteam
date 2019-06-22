package day2.Topic8;

public class Person {
    private int age;
    private String name;
    private String weight;


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        System.out.println(weight);
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(age);
        this.age = age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

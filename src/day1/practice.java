package day1;

public class practice {
    public static void main(String[] args) {

    }

    //附加练习:数组的基本使用方法
    //处理数组
    //动态初始化的格式
    /*
    new就是动态分配一个内存空间
    int[] arr=new int[3];
    左边:
        int: 说明数组中的元素类型是int类型
        [] :说明这是一个数组
        arr:是数组的名称

    右边:
        new:为数组分配内存空间
        int:说明数组中的元素的数据类型
        [] :说明这是一个数组
        3:数组长度
     */

    public static void TestArrray() {
        double[] myList = {1.9, 7.9, 3.4, 3.5};

        //打印所有的数组元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("总和是:" + total);

        // 查找最大元素
        double maxValue;
        maxValue = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > maxValue) {
                maxValue = myList[i];
            }
        }
        System.out.println("最大的值:" + maxValue);

        //数组作为函数的参数
    }


    //数组作为函数的参数
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

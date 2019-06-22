package day2;

/**
 * 作业4: 封装一个数组对象(暂时用int型即可)
 * <p>
 * 可先定义个数组看下,比如int[],有哪些方法提供,太少了
 * <p>
 * 要求实现: 数组类
 * <p>
 * - new 时传入指定大小
 * <p>
 * - 可以添加元素
 * <p>
 * - 可以删除元素
 * <p>
 * - 可以根据给定元素,找到索引位置
 * <p>
 * - 并支持跨度寻找,如find(1234,5),即夸过5个索引之后寻找
 * <p>
 * - 实现对数组的遍历功能
 * <p>
 * - 实现判断数组是否为空
 * <p>
 * - 不理解,看下Topic6,栈的设计
 *
 * @author haoc
 */

public class Topic4 {
    public static void main(String[] args) {
        //初始化数组
        int[] arrayDemo = arrayDemo(10);

//        //添加
//        arrayDemoAdd(arrayDemo(10),121121212);

        //删除数组里面的元素,把指定元素位置变为空
//        arrayDemoDelete(new int[]{1, 2, 3, 4, 5}, 2);

        //删除数组里面的元素,把后面的元素往前挪动
//        arrayDemoDelete2(new int[]{1, 2, 3, 4, 5}, 5);
          arrayDemoDelete2(new int[]{1, 2, 3, 4, 5}, 0);

//        //可以根据给定元素,找到索引位置
//        arrayDemoFindValues(new int[]{1, 2, 3, 4, 5},5);
//
//        //并支持跨度寻找,如find(1234,5),即跨到5个索引之后寻找
//
//        //实现对数组的遍历功能
//        arrayDemoFacility(new int[]{1, 2, 3, 4, 5});
//
//        //实现判断数组是否为空
//        arrayDemoCheckempty(new int[]{});
    }

    //初始化数组
    public static int[] arrayDemo(int length) {
        int[] array = new int[length];
        return array;
    }

    //添加
    public static int[] arrayDemoAdd(int[] arrrlist,int values){
        int[] newarrlist=new int[(arrrlist.length)+1];
        newarrlist[(arrrlist.length)]=values;
        for (int i = 0; i < newarrlist.length; i++) {
            System.out.println(newarrlist[i]);
        }
        return newarrlist;
    }

    //删除数组里面的元素,把指定元素位置变为空,第一种方法把当前这个数组置为空
    public static int[] arrayDemoDelete(int[] arrlist, int value) {
        for (int i = 0; i < arrlist.length; i++) {
            if (arrlist[i] == value) {
                System.out.println(arrlist[i]);
                System.out.println(i);
                arrlist[i] = 0;
            }

        }
        return arrlist;
    }

    /**
     *删除数组里面的坐标,把后面的数据往前走,case2
     */

    //arrayDemoDelete2(new int[]{1, 2, 3, 4, 5}, 2);
    public static void arrayDemoDelete2(int[] arrlist, int index) {

        if (index>=arrlist.length){
            throw new ArrayIndexOutOfBoundsException("查找的这个坐标值太大,没有");
        }

        int[] newArry = new int[arrlist.length-1];
        for (int i = 0; i < arrlist.length; i++) {
            if (i<index) {
                newArry[i]=arrlist[i];
            }

            if (i>index) {
                newArry[i-1]=arrlist[i];
            }


        }

        System.out.println("---------");

        for (int i = 0; i <newArry.length ; i++) {
            System.out.println(newArry[i]);
        }
    }

    //查找元素
    public static int arrayDemoFindValues(int[] arrlist,int count){
        for (int i = 0; i < arrlist.length; i++) {
            if (arrlist[i] == count) {
                System.out.println("index:"+i);
                return i;
            }
        }
        System.out.println("找不到元素");
        return 0;
    }

    //实现对数组的遍历功能
    public static void arrayDemoFacility(int[] arrlist) {
        for (int a:
             arrlist) {
            System.out.println(" "+a);
        }
    }

    //实现判断数组是否为空
    public static boolean arrayDemoCheckempty(int[] arrlist){
        if (arrlist.length==0){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}



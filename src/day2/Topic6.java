package day2;

/**
 * 作业6: 使用数组实现一个栈,元素整型即可
 * <p>
 * 要求:
 * <p>
 * - 实现入栈,enqueue
 * <p>
 * - 实现出栈,dequeue
 * <p>
 * - 实现获取栈顶元素值,getFront
 * <p>
 * - 实现获取栈的大小
 * <p>
 * - 实现判断栈是否为空
 *
 * @author haoc
 */

public class Topic6 {
    private int[] dataArray;
    private static final int DEFAULT_CAPACITY = 5;
    private int theSize;

    //栈元素容量
    public void ensureCapacity(int newCapacity) {
        if (theSize > newCapacity) {
            System.out.println("容量超出最大的长度设置");
            return;
        }
        dataArray = new int[DEFAULT_CAPACITY];
    }

    //获取所有的值
    public void getCapacity() {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(dataArray[i]);
        }
    }

    //实现入栈,enqueue
    public void push(int value) {
        if (dataArray.length == theSize) {
            System.out.println("满了");
            return;
        }
        dataArray[theSize++] = value;
    }

    //实现出栈,dequeue
    public int pull() {
        if (isEmpty()){
            return 0;
        }
        theSize = theSize - 1;
        System.out.println(dataArray[theSize]);
        dataArray[theSize]=0;
        return dataArray[theSize];

    }

    //实现判断栈是否为空
    public boolean isEmpty(){
        return theSize==0;
    }

    //实现获取栈顶元素值,getFront
    public int getFront(){
        System.out.println("栈顶元素:"+dataArray[theSize-1]);
        return dataArray[theSize-1];
    }

    //实现获取栈的大小
    public int arraySize(){
        System.out.println("栈的大小为:"+theSize);
        return theSize;
    }

    /**
     * size 5
     * length 5
     * @param args
     */
    public static void main(String[] args) {
        Topic6 topic6 = new Topic6();
        topic6.ensureCapacity(5);
        topic6.push(2);
        topic6.push(3);
        topic6.push(4);
        topic6.push(5);
        topic6.push(6);
        topic6.push(7);

        topic6.getCapacity();

//        //出栈
//        topic6.pull();
//        topic6.pull();
//        topic6.pull();
//        topic6.pull();
//        topic6.pull();
//        topic6.pull();
        topic6.pull();

        //获取栈顶元素
        topic6.getFront();

        //实现获取栈的大小
        topic6.arraySize();
    }
}

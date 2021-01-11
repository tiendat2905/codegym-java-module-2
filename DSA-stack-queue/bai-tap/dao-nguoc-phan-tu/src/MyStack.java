import org.w3c.dom.Node;

import java.util.Arrays;

public class MyStack {
    int[] arr = new int[5];
    public int size = 0;

    public MyStack() {

    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == 5) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("full");
            return;
        }
        arr[size] = value;
        size++;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack dang rong");
            return 0;
        }
        int temp = arr[size - 1];
        size--;
        return temp;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);

        System.out.println(Arrays.toString(myStack.arr));

        System.out.println(myStack.pop());
        System.out.println(Arrays.toString(myStack.arr));
        System.out.println(myStack.pop());
        System.out.println(Arrays.toString(myStack.arr));
        System.out.println(myStack.pop());
        System.out.println(Arrays.toString(myStack.arr));
    }
}



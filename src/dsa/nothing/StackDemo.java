package dsa.nothing;


class StackUsingArray {
    int arr[];
    int capacity;
    int top = -1;


    public StackUsingArray(int arr[], int capacity) {
        this.arr = arr;
        this.capacity = capacity;
    }

    public int peek() {
        return arr[top];
    }

    public void push(int element) {
        if(overflow()){
            throw new RuntimeException("OverFlow Occurred");
        }
        arr[++top] = element;

    }

    public int pop() {
        if(underflow()){
            throw new RuntimeException("Underflow Occurred");
        }
        return arr[top--];
    }

    public boolean overflow() {
        return top > capacity;
    }

    public boolean underflow() {
        return top == -1;
    }
}


public class StackDemo {
    public static void main(String args[]) {
        int[] arr = new int[20];
        StackUsingArray stack = new StackUsingArray(arr, 20);

        stack.push(2);
        stack.push(4);
        stack.pop();
        System.out.println(stack.peek());


    }
}

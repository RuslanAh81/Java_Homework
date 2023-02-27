package task2;

public class Main {
    public static void main(String[] args) {
        MyQueue list = new MyQueue();
        list.enqueue(15);
        list.enqueue(26);
        list.enqueue(37);
        list.enqueue(48);

        System.out.println(list.first());
        System.out.println(list.dequeue());
        System.out.println(list.first());

    }
}

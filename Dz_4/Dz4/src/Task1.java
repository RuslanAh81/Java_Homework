import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
/* можно вернуть перевернутый список через перевод его в стек, а можно с помощью очереди ,тут оба попробовал*/
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        ShowList(list);
       // System.out.println(toStack(list));
        //ShowStack(toStack(list));

    }
    static LinkedList<Integer> createList(int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i<size; i++) {
            list.add(i+1);
        }
        return list;
    }

    static Stack<Integer> toStack(LinkedList<Integer> list) {
        int current = list.size();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<current; i++) {
            stack.push(list.get(i));
        }
        return stack;
    }
    static void ShowStack(Stack<Integer>stack) {
        Queue<Integer>queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while(!queue.isEmpty()){
            stack.add(queue.remove());
        }
        System.out.print(stack);

    }

    static void ShowList(LinkedList<Integer>list) {
        Deque<Integer>deque = new LinkedList<>();
        while (!list.isEmpty()) {
            deque.add(list.pop());
        }
        while(!deque.isEmpty()){
            list.add(deque.pollLast());
        }
        System.out.print(list);

    }
}


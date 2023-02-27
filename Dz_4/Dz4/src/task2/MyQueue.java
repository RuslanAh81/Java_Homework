package task2;

import java.util.LinkedList;

public class MyQueue {

    private LinkedList<Integer>list= new LinkedList<>();


    void enqueue(int item){
        list.addLast(item);
    }
    // dequeue() - возвращение первого  элемента из очереди и удаляет его.
    Integer dequeue(){
        if(list.size()>0) {
            return list.pollFirst();
        }
        return null;
    }
    //first() - возвращает первый элемент из очереди, не удаляя.
    Integer first() {
        if (list.size() > 0) {
            return list.peekFirst();
        }
        return null;
    }
}

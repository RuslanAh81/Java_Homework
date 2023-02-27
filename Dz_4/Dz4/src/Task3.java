import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка:");
        int size = sc.nextInt();
        System.out.println("ВВедите максимальное значение в списке:");
        int upperBound = sc.nextInt();
        LinkedList<Integer> list = createList(size, upperBound);
        int sum = summOfEll(list);
        System.out.printf("Ваш список :" + list);
        System.out.printf("\n Сумма элементов списка =%d", sum);
        sc.close();
    }

    static LinkedList<Integer> createList (int size, int upperBond) {
        LinkedList<Integer> llist = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            llist.add((rnd.nextInt(upperBond)));
        }
        return llist;
    }

    static int summOfEll(LinkedList<Integer>llist) {
        int mySumm =0;
        Iterator<Integer> iter = llist.iterator();
        while (iter.hasNext()) {
            int item = iter.next();
            mySumm += item;
            System.out.println();
        }
        return mySumm;
    }
}

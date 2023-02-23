import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = sc.nextInt();
        System.out.println("Введите максимальное значение в списке: ");
        int maxVal = sc.nextInt();
        //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 5, 13, 23, 8, 35, -8, -3));
        ArrayList<Integer> numbers = getRandomList(size,maxVal);
        System.out.printf("Первоначальный список:%s\n", numbers.toString());
        System.out.printf("Список из нечетных элементов: %s", oddList(numbers).toString());
        sc.close();
    }

    private static ArrayList<Integer> getRandomList(int size,int a){
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i =0; i<size; i++){
            list.add(rnd.nextInt(a));
        }
        return list;
    }



    private static ArrayList<Integer> oddList(ArrayList<Integer>list) {
        Iterator<Integer> iteratorList = list.iterator();
        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            if (item%2 == 0) iteratorList.remove();
        }
        return list;
    }
}

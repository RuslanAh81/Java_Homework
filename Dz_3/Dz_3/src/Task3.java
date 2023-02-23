import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = sc.nextInt();
        System.out.println("Введите максимальное значение в списке: ");
        int maxVal = sc.nextInt();
        //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 5, 13, 23, 8, 35, -8, -3));
        ArrayList<Integer> numbers = getRandomList(size, maxVal);
        System.out.printf("Первоначальный список:%s\n", numbers.toString());
        System.out.printf("Максимальное число: %s\n", arrMaxVal(numbers));
        System.out.printf("Минимальное число: %s\n", arrMinVal(numbers));
        System.out.printf("Среднее арифметическое: %s", averageVal(numbers));
       // System.out.printf("Минимальное число: %s\n", getMin(numbers));
        sc.close();
    }

    private static ArrayList<Integer> getRandomList(int size, int a) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(a));
        }
        return list;
    }

    private static int arrMaxVal(ArrayList<Integer>list) {
        int max=0;
        for (int element: list){
            if (element> max)
                max = element;
        }
        return max;
    }

    private static int arrMinVal(ArrayList<Integer>list) {
        int min= 100;
        for (int element: list){
            if (element< min)
                min = element;
        }
        return min;
    }

    private static Double averageVal(ArrayList<Integer>list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double averageValue=(double) sum/ list.size();
        return averageValue;
    }

//    public static Integer getMin(ArrayList<Integer> list)
//    {
//        if (list == null || list.size() == 0) {
//            return Integer.MAX_VALUE;
//        }
//
//        return Collections.min(list);
//    }
}
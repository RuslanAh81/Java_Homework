//Задано уравнение вида q+w= e q,w,e>0. Требуется восстановить выражение до верноего равенства
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        String str = "2? + ?5 = 69";
        String[] arr = str.split(" ");
        String q= arr[0];
        String w= arr[2];
        String e= arr[arr.length -1];
        boolean flag = true;
        for (int i = 0; i<10; i++) {
            int qNum = Integer.parseInt(q.replace("?", Integer.toString(i)));
            for (int j = 0; j<10; j++) {
                int wNum = Integer.parseInt(w.replace("?", Integer.toString(j)));
                for (int k = 0; k<10; k++) {
                    int eNum= Integer.parseInt(e.replace("?", Integer.toString(k)));
                    if (qNum + wNum == eNum) {
                        System.out.printf("Решение уравнения %s => %d +% d = %d\n", str, qNum, wNum, eNum);
                        flag = false;
                        break;
                    }
                }if (flag == false) break;
            }if (flag == false) break;
        }if (flag) System.out.println("Решений нет ");

    }
}

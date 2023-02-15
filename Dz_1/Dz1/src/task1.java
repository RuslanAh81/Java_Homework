// Вычислить n-ое треугольного число (сумма чисел от 1 до n),n!
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Треугольное число для  n = "+ Triangle(a)+"\n");
        System.out.println("Факториал числа для n = "+ Factor(a)+"\n");

    }
    public static int Triangle(int n) {
        if (n ==1) {
            return 1;
        } else   return (n*(n+1))/2;
    }
    public static int Factor(int n) {
        int fact =1;
        if (n==1 && n==0) {
            return 1;
        } else {
            for (int i = 2; i<=n; i++) {
                fact *=i;
            }
        }return fact;
    }
}


//Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float a = sc.nextFloat();
        System.out.println("Введите операцию(+, -, *,/): ");
        char op_symbol = sc.next().charAt(0);
        System.out.println("Введите второе число:");
        float b= sc.nextFloat();
        float res;
        if (op_symbol == '+') {
            res= a+b;
            System.out.println(res);
        } else if(op_symbol =='-') {
            res = a-b;
        } else if(op_symbol == '*') {
            res = a*b;
        } else if(op_symbol =='/') {
            res = a/b;
        } else{
            System.out.println("Операция не поддерживается");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();

        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Сумма двух чисел: " + (firstNumber + secondNumber));
        System.out.println("Разность двух чисел: " + (firstNumber - secondNumber));
        System.out.println("Произведение двух чисел: " + (firstNumber * secondNumber));
        System.out.println("Частное двух чисел: " + quotient);

    }
}

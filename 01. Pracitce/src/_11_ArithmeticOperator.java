import java.util.Scanner;

public class _11_ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오. :");

        int time = scanner.nextInt();
        int hour = time / 3600;
        int minute = time / 60 % 60;
        int second = time % 60;

        System.out.printf("%d시간 %d분 %d초", hour, minute, second);
        scanner.close();
    }
}

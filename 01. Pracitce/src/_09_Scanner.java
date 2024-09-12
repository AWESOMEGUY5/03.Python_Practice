import java.util.Scanner;

public class _09_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("이름은 " + name + ",");

        String city = scanner.next();
        System.out.println("도시는 " + city + ",");

        int age = scanner.nextInt();
        System.out.println("나이는 " + age + "살,");

        scanner.close();
    }
}

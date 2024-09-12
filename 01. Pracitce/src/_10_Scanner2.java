import java.util.Scanner;

public class _10_Scanner2 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 결혼 여부를 빈칸으로 분리하여 입력하시오");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.printf("이름은 %s ", name);

        String city = scanner.next();
        System.out.printf(" 도시는 %s", city);

        int age = scanner.nextInt();
        System.out.printf(" 나이는 %d", age);

        double weight = scanner.nextDouble();
        System.out.printf(" 체중은 %g", weight);

        boolean isSingle = scanner.nextBoolean();
        System.out.println(" 결혼 여부는 " + isSingle + "입니다.");
    }
}

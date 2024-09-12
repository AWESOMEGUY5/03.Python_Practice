public class _12_AssginmentIncDecOperator {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        System.out.printf("a : %d, b : %d, c : %d\n", a + 3, b * 3, c % 2);

        int d = 3;
        System.out.printf("a : %d d : %d\n", a, d++);
        System.out.printf("a : %d d : %d\n", a, ++d);

        a = d;
        System.out.printf("a : %d d : %d\n", a, d--);
        System.out.printf("a : %d d : %d\n", a, --d);
    }
}

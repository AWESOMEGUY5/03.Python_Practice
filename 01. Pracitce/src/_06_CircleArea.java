import static java.lang.Math.pow;

public class _06_CircleArea {
    public static void main(String[] args) {
        double radius = 10, circleArea = pow(radius, 2) * Math.PI;
        System.out.printf("%gcm^2", circleArea);
    }
}

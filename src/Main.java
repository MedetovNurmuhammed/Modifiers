import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус:");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        double area = circle.area(radius);
        System.out.println("Площадь круга: " + area);
        double circumference = circle.circumference(radius);
        System.out.println("Длина окружности: " + circumference);
    }
}
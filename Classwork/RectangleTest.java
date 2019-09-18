import java.util.Scanner;

public class RectangleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        double l = sc.nextDouble();
        System.out.println("Enter Height:");
        double h = sc.nextDouble();
        Rectangle rectangle = new Rectangle(l,h);
        System.out.println("Your area is: " + rectangle.getArea());
        sc.close();
    }
}
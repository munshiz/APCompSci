import java.util.Scanner;

public class RectangleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        Rectangle rectangle = new Rectangle(l,h);
        System.out.println("Your area is: " + rectangle.getArea() + " Your perimeter is: " + rectangle.getPerimeter());
        sc.close();
    }
}
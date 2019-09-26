import java.util.Scanner;

public class TriangleTest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate for your first point");
        int x1 = sc.nextInt();
        System.out.println("Enter the y coordinate for your first point");
        int y1 = sc.nextInt();
        System.out.println("Enter the x coordinate for your second point");
        int x2 = sc.nextInt();
        System.out.println("Enter the y coordinate for your second point");
        int y2 = sc.nextInt();
        System.out.println("Enter the x coordinate for your third point");
        int x3 = sc.nextInt();
        System.out.println("Enter the y coordinate for your third point");
        int y3 = sc.nextInt();
        sc.close();
        
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        System.out.println("\n" + "Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
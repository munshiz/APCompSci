import java.util.Scanner;

public class TriangleTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("X for first point");
        int x1 = scan.nextInt();
        System.out.println("y for first point");
        int y1 = scan.nextInt();
        System.out.println("X for second point");
        int x2 = scan.nextInt();
        System.out.println("Y for second point");
        int y2 = scan.nextInt();
        System.out.println("X for third point");
        int x3 = scan.nextInt();
        System.out.println("Y for third point");
        int y3 = scan.nextInt();
        scan.close();
        
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        
        System.out.println("Your Area is: " + triangle.getArea());

    }
}
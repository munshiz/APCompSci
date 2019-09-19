import java.util.Scanner;

public class CylinderTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double h = sc.nextDouble();
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        Cylinder cyl = new Cylinder(h, r);
        System.out.println("Your volume is: " + cyl.getVolume());
        sc.close();
    }
}

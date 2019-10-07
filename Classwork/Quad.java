import java.lang.Math;
import java.util.Scanner;

public class Quad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        System.out.print("C: ");
        double c = sc.nextDouble();
        
        double discriminant = getDisc(a, b, c);

        if (discriminant < 0){
            System.out.println("Imaginary Number!");
        }

        if (discriminant == 0){
            System.out.println("Single root, " + getRoots(a, b, discriminant)[0]);
        }

        else{
            System.out.println("X1: " + getRoots(a, b, discriminant)[0]);
            System.out.println("X2: " + getRoots(a, b, discriminant)[1]);
        }
    }

    public static double getDisc(double a, double b, double c){
        return Math.pow(b, 2) - (4 * a * c);
    }

    public static double[] getRoots(double a, double  b, double d){
        double[] roots = {0,0};
        roots[0] = (-1 * b + Math.sqrt(d)) / (2 * a);
        roots[1] = (-1 * b - Math.sqrt(d)) / (2 * a);
        return roots;
    }
    
}
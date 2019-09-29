import java.util.Scanner;
public class LineTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "Now recieving Points for Line 1: ");
        System.out.print("Enter the x coordinate for your first point: ");
        Double x1 = sc.nextDouble();
        System.out.print("Enter the y coordinate for your first point: ");
        Double y1 = sc.nextDouble();
        System.out.print("Enter the x coordinate for your second point: ");
        Double x2 = sc.nextDouble();
        System.out.print("Enter the y coordinate for your second point: ");
        Double y2 = sc.nextDouble();

        System.out.println("\n" + "Now recieving Points for Line 2: ");
        System.out.print("Enter the x coordinate for your first point: ");
        Double L2x1 = sc.nextDouble();
        System.out.print("Enter the y coordinate for your first point: ");
        Double L2y1 = sc.nextDouble();
        System.out.print("Enter the x coordinate for your second point: ");
        Double L2x2 = sc.nextDouble();
        System.out.print("Enter the y coordinate for your second point: ");
        Double L2y2 = sc.nextDouble();
        sc.close(); 
        
        Line Line = new Line(new Point(x1, y1), new Point(x2, y2));
        Line Line2 = new Line(new Point(L2x1 ,L2y1), new Point(L2x2, L2y2));
        
        if (Line.isIntersect(Line2)){
            System.out.println("\n" + "Intersects at: " + Line.getIntersectionPoint(Line2).getX() + ", " + 
            Line.getIntersectionPoint(Line2).getY() );
        }

        else{
            System.out.println("\n" + "No intersection, lines are parallel.");
        }
    }
}
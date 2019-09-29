import java.lang.Math;

public class Triangle{
    private double side1;
    private double side2;
    private double side3;

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        sides = useDistanceFormula(x1, x2, y1, y2);
        sides = useDistanceFormula(x2, x3, y2, y3);
        sides = useDistanceFormula(x3, x1, y3, y1);
    } 

    public double getArea(){
        double Svalue = getPerimeter() / 2;
        double Area = Math.sqrt(Svalue * (Svalue - side1) * (Svalue - side2) * (Svalue - side3));
        return Area;
    }

    public double getDistance(int x2, int x1, int y2, int y1){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }
    

}
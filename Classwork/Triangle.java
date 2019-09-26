import java.lang.Math;

public class Triangle{
    private double[] sides = {2, 2, 2};

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.sides[0] = useDistanceFormula(x1, x2, y1, y2);
        this.sides[1] = useDistanceFormula(x2, x3, y2, y3);
        this.sides[2] = useDistanceFormula(x3, x1, y3, y1);
    } 

    public double getArea(){
        double S = getPerimeter() / 2;
        double Area = Math.sqrt(S * (S - sides[0]) * (S - sides[1]) * (S - sides[2]));
        return Area;
    }

    public double useDistanceFormula(int x2, int x1, int y2, int y1){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    
    public double getPerimeter(){
        return (sides[0] + sides[1] + sides[2]);
    }
    

}
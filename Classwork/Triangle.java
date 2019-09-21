import java.lang.Math;



public class Triangle{
    
    private int[] xcoord = {0,0,0};
    private int[] ycoord = {0,0,0};
    
    
    Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        xcoord[0] = x1;
        xcoord[1] = x2;
        xcoord[2] = x3;
        ycoord[0] = y1;
        ycoord[1] = y1;
        ycoord[2] = y1;
    } 

    public double calculateDistance(int x1, int y1,int x2, int y2){
        return Math.sqrt(Math.pow(2,(x2 - x1)) + Math.pow(2,(y2 - y1)));
    }
    
    public double getArea(){
        double one = calculateDistance(xcoord[0], xcoord[1], ycoord[0], ycoord[1]);
        double two = calculateDistance(xcoord[1], xcoord[2], ycoord[1], ycoord[2]);
        double three = calculateDistance(xcoord[2], xcoord[0], ycoord[2], ycoord[0]);
        double Svalue = getPerimeter() / 2;
        double Area = Math.sqrt(Svalue * (Svalue - one) * (Svalue - two) * (Svalue - three));
        return Area;
    }
    public double getPerimeter(){
        double one = calculateDistance(xcoord[0], xcoord[1], ycoord[0], ycoord[1]);
        double two = calculateDistance(xcoord[1], xcoord[2], ycoord[1], ycoord[2]);
        double three = calculateDistance(xcoord[2], xcoord[0], ycoord[2], ycoord[0]);
        System.out.println(one + two + three);
        
        return (one + two + three);
    }
    

}
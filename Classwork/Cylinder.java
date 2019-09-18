public class Cylinder{
    
    private double height;
    private Circle circle;

    public Cylinder(double h, double r){
        circle = new Circle(r);
        height = h;
    }
    
    public double getArea(){
        double Area = circle.getArea() * height;
        return Area;
    }
    
}
public class Cylinder{
    
    double height;
    Circle circle;

    public Cylinder(double h, double r){
        circle = new Circle(r);
        height = h;
    }
    
    public double getArea(){
        double Area = circle.getArea() * height;
        return Area;
    }
    
}
public class Rectangle{
    
    private double height;
    private double length;

    public Rectangle(double l, double h){
        height = l;
        length = h;
    }

    public double getArea(){
        return length * height;
    }

    public double getPerimeter(){
        return 2 * length + 2 * height;
    }
    

    
}
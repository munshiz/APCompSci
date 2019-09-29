public class Line{
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isIntersect(Line OtherLine){
        return !(this.getSlope() == OtherLine.getSlope());
    }

    public double getSlope(){
        return p1.getSlope(p2);
    }

    public double getYIntercept(){
        return p2.getY() - (p2.getX() * this.getSlope());
    }
    public Point getIntersectionPoint(Line OtherLine){
        if (this.isIntersect(OtherLine)){
           double subtractIntercepts =  this.getYIntercept() - OtherLine.getYIntercept();
           double subtractSlopes =  OtherLine.getSlope() - this.getSlope();
           double intersectX = subtractIntercepts / subtractSlopes;
           double intersectY = intersectX * this.getSlope() + this.getYIntercept();
           return new Point(intersectX, intersectY);
        }
        return new Point(0, 0);
    }
}

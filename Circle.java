Public class Circle{
    private Point myCenter;
    private double myRadius;

    public Circle(){
        myCenter = new Point();
        myRadius = 0.0;
    }
    public Circle(Point center, double radius){
        myCenter = new Point(center.getMyX(), center.getMyY());
        myRadius = radius;
    }
    public double getRadius(){
        return myRadius;
    }
    public void setRadius(double newRadius){
        myRadius = newRadius;
    }
    public void setCenter(double x, double y){
        myCenter.setMyX(x);
        myCenter.setMyY(y);
    }
    public boolean isInside(Point other){
        double xCheck=other.getMyX();
        double yCheck=other.getMyY();
        double xCenter=myCenter.getMyX();
        double yCenter=myCenter.getMyY();
        double radSquare=Math.pow(myRadius,2.0);
        return Math.pow((xCheck-xCenter),2.0)+Math.pow(yCheck-yCenter,2.0)<=radSquare;
    }
}
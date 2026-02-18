//Point Class
public class Point{
    private double myX;
    private double myY;

    public Point()
    {
        myX = 0.0;
        myY = 0.0;
    }

    public Point(Double x, Double y)
    {
        myX = x;
        myY = y;
    }

    public double getMyX()
    {
        return myX;
    }

    public double getMyY()
    {
        return myY;
    }
    public void setMyX(double x)
    {
        myX = x;
    
    }
    public void setMyY(double y)
    {
        myY = y;
    }

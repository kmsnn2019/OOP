package NIIT.Triangle;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int [] array = new int[2];
        array[1]= this.x;
        array[2] = this.y;

        return array;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y)
    {
       return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }

    public double distance()
    {
        return Math.sqrt((this.x)^2 + (this.y)^2);
    }

    public double distance(MyPoint point)
    {
        return Math.sqrt((point.x-this.x)^2 + (point.y-this.y)^2);
    }


}

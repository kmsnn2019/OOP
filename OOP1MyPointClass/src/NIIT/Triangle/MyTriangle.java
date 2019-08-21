package NIIT.Triangle;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        MyPoint v1 = new MyPoint(x1,y1);
        MyPoint v2 = new MyPoint(x2,y2);
        MyPoint v3 = new MyPoint(x3,y3);

        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public boolean getExistance(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double l1 = v1.distance(v2.getX(),v2.getY());
        double l2 = v1.distance(v3.getX(),v3.getY());
        double l3 = v2.distance(v3.getX(),v3.getY());

        if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1)
            return true;
        else {
            System.out.println("Triangle with input vertices doesn't exist. Please, try again!");
            return false;
        }
        }

    @Override
    public String toString() {
        return "MyTriangle[ " +
                "v1= " +  this.v1 +
                ", v2 = " +  this.v2 +
                ", v3 = " + this.v3 +
                "]";
    }

    public double getPerimeter(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        MyPoint v1 = new MyPoint(x1,y1);
        MyPoint v2 = new MyPoint(x2,y2);
        MyPoint v3 = new MyPoint(x3,y3);

        return v1.distance(v2.getX(),v2.getY())+v1.distance(v3.getX(),v3.getY())+v2.distance(v3.getX(),v3.getY());
    }

    public String getType(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        MyPoint v1 = new MyPoint(x1,y1);
        MyPoint v2 = new MyPoint(x2,y2);
        MyPoint v3 = new MyPoint(x3,y3);

        double l1 = v1.distance(v2.getX(),v2.getY());
        double l2 = v1.distance(v3.getX(),v3.getY());
        double l3 = v2.distance(v3.getX(),v3.getY());

        if (l1 == l2 && l2 ==l3)
            return "Equilateral";
        if (l1 == l2 || l1==l2 || l2==l3)
            return "Isosceles";
        else
            return "Scalene";
    }
}

package NIIT;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        if (length == 0 || width == 0)
            System.out.println("Rectangle with such values of length and width doesn't exist!");
        if (length < 0 || width < 0)
        {
            length = -length;
            width = -width;
        }
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length == 0 )
            System.out.println("Incorrect values of length!");
        if (length < 0)
        {
            length = -length;
        }

        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width == 0)
            System.out.println("Incorrect values of width!");
        if (width < 0)
        {
            width = -width;
        }

        this.width = width;
    }

    public double getArea(float length, float width)
    {
        return (double) length*width;
    }

    public double getPerimeter(float length, float width)
    {
        return (double) 2*length + 2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length= " + length +
                ", width= " + width +
                '}';
    }
}

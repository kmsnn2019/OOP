package NIIT.Circle;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius == 0)
            System.out.println("Некорректное значение поля радиус");
        if (radius <0)
            radius = -radius;
        this.radius = radius;
    }

    public Circle(double radius, String color) {

        if (radius == 0)
            System.out.println("Некорректное значение поля радиус");
        if (radius <0)
            radius = -radius;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius == 0) {
            System.out.println("Некорректное значение поля радиус");
        }
        if (radius <0)
            radius = -radius;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius)
    {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

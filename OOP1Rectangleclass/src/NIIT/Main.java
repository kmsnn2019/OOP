package NIIT;

public class Main {

    public static void main(String[] args) {

    Rectangle rec = new Rectangle(1.0f, 1.0f);
    System.out.println(rec.toString() + "\n");
        System.out.format("Rectangle perimeter : %.3f%n",  rec.getPerimeter(rec.getLength(),rec.getWidth()));
        System.out.format("Rectangle square : %.3f%n ", rec.getArea(rec.getLength(),rec.getWidth()));

    // write your code here
    }
}

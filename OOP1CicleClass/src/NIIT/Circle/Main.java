package NIIT.Circle;

import NIIT.Circle.Circle;

public class Main {

    public static void main(String[] args) {

        Circle cir = new Circle(-1,"red");
        System.out.format("Радиус равен " + cir.getRadius()+ "\nЦвет " + cir.getColor() + "\nПлощадь %.3f%n", cir.getArea(cir.getRadius()));


	// write your code here
    }
}

package NIIT.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x[] = new int [3];
        int y[] = new int [3];

        boolean k = false;
        do {

            Scanner input = new Scanner(System.in);

            System.out.print("Insert integer coordinates (x,y) of the first triangle vertice : ");
            x[0] = input.nextInt();
            y[0] = input.nextInt();

            System.out.print("Insert integer coordinates (x,y) of the second triangle vertice : ");
            x[1] = input.nextInt();
            y[1] = input.nextInt();

            System.out.print("Insert integer coordinates (x,y) of the third triangle vertice : ");
            x[2] = input.nextInt();
            y[2] = input.nextInt();

            MyTriangle tria1 = new MyTriangle(x[0], y[0], x[1], y[1], x[2], y[2]);
            k = tria1.getExistance(x[0], y[0], x[1], y[1], x[2], y[2]);
        }
        while (k == false);

        MyTriangle tria = new MyTriangle(x[0], y[0], x[1], y[1], x[2], y[2]);
        System.out.println(tria.toString());

        System.out.format("Perimeter: %.3f%n", tria.getPerimeter(x[0],y[0],x[1],y[1],x[2],y[2]));
        System.out.println("Triangle Type: " + tria.getType(x[0],y[0],x[1],y[1],x[2],y[2]));
	// write your code here
    }
}

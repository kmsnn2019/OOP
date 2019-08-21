package NIIT.Employee;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert employee ID : ");
        int _id = input.nextInt();

        System.out.println("Insert employee First Name : ");
        String _FirstName = input.next();

        System.out.println("Insert employee Last Name : ");
        String _LastName = input.next();

        System.out.println("Insert employee monthly salary ($) : ");
        int _salary = input.nextInt();

        System.out.println("Insert monthly employee salary increase percentage : ");
        int _percentSalary = input.nextInt();

        Employee em = new Employee(_id, _FirstName, _LastName, _salary);
        System.out.println(em.toString() + "\n");
        System.out.println(em.getName(_FirstName, _LastName, _salary));
        System.out.println("New monthly employee salary: " + em.raiseSalary(_percentSalary) + "$");
	// write your code here
    }
}

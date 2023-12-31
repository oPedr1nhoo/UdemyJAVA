package Program;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

       List<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

             list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }

            else{

                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        for (Employee emp : list){
            System.out.println("PAYMENTS:");
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
}
}
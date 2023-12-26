package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.printf("\nEmail of people whose salary is more than %.2f: \n", salary);

            list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList()).forEach(System.out::println);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f ",
                    list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x + y));


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
sc.close();
    }
}
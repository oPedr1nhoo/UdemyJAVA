package application;

import entities.Aluno;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.printf("How many students for course A?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.printf("ID students #"+(i+1) +": ");
        int number = sc.nextInt();
            a.add(number);
        }

        System.out.printf("How many students for course B?: ");
         n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.printf("ID students #"+(i+1) +": ");
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.printf("How many students for course  C ?: ");
         n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.printf("ID students #"+(i+1) +": ");
            int number = sc.nextInt();
            a.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

System.out.println("Total students: " + total.size());


      sc.close();
    }
}
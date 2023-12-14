package Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 0;
        System.out.printf("Digite a quantidade de números a serem digitados: ");
        n = sc.nextInt();


        double[] vect = new double[n];
        double soma = 0;


        while (i < n) {
            System.out.printf("Digite um número: ");


            vect[i] = sc.nextDouble();
            sc.nextLine();
            soma += vect[i];





            i++;
        }

        double media = soma / n;

        for (i = 0; i < n; i++) {
            System.out.println("Números Digitados: " + vect[i]);
        }
        System.out.println("soma dos números Digitados: " + soma);
        System.out.println("media dos números Digitados: " + media);

        sc.close();
    }
}

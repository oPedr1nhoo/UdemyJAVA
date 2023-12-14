package Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 0;
        int j = 0;
        System.out.printf("Digite a quantidade de números a serem digitados: ");
        n = sc.nextInt();


        double[] vect = new double[n];
        double[] vect1 = new double[n];

        while (i < n) {
            System.out.printf("Digite um número: ");


            vect[i] = sc.nextDouble();
            sc.nextLine();



            if(vect[i] < 0){

                vect1[j]= vect[i];
                j++;
            }
            i++;
        }


        for (i = 0; i < j; i++) {
            System.out.println("Números negativos: " + vect1[i]);
        }


        sc.close();
    }
}

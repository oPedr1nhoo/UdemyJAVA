package Program;

import java.util.Scanner;
import entities.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Scanner sc = new Scanner(System.in);

        Rectangle A;
        A  = new Rectangle();

        System.out.printf("Digite o valor para a altura do retângulo: ");
        A.altura = sc.nextDouble();


        System.out.printf("\nDigite o valor para a largura do retângulo: ");
        A.largura = sc.nextDouble();



        System.out.printf("\nA area tem valor de : %.2f ", A.area());
       System.out.printf("\nA perimetro tem valor de : %.2f  ", A.perimetro());
        System.out.printf("\nA diagonal tem valor de : %.2f  ", A.diagonal());





       sc.close();
        }
    }

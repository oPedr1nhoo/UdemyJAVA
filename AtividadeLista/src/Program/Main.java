package Program;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


import Entities.Funcionario;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.printf("Digite a quantidade de funcionários:");
        int n = sc.nextInt();

    for(int i = 0; i < n; i++){
    System.out.printf("\nDigite o ID do funcionário: ");
    int id = sc.nextInt();

        System.out.println("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Salary:");
        double salario =  sc.nextDouble();
        lista.add(new Funcionario(id, name, salario));

    }

    System.out.printf("\n");

    System.out.print("Lista de funcionários\n");

    for(Funcionario x : lista){
        System.out.println(x);
    }



sc.close();


    }
}
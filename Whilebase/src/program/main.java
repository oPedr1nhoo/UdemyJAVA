package program;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int s1;
		
		int senha = 5343;
		
				
		while(senha == 5343) {
			System.out.printf("Digte a senha: ");
		s1 = sc.nextInt();
		if(s1 == senha) {
			System.out.println("Senha Válida!!");
		break;
		}
else	
	System.out.println("Senha Inválida!!");
		
		}
	
			
		sc.close();

	}

}

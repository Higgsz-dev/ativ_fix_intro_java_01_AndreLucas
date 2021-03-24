package ativ_18_POO_AndreLucas;

import ativ_18_POO_Classes_AndreLucas.Atividade1_Nome;

public class Aplicação {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Atividade 1");
		//Criando o objeto da atividade 1
		Atividade1_Nome nome = new Atividade1_Nome();
		
		//Atribuindo nome ao atribudo
		nome.setNome("André");
		//Exibindo nome
		System.out.println("Meu nome: "+nome.getNome());
		System.out.println(" ");
		
		//Atividade 2
		System.out.println("Atividade 2");
		for (int i = 150; i <= 250; i++) {
			num = num+i;
		}
		
		System.out.println("A soma é:"+num);
		System.out.println("");
		
		//Atividade 3
		System.out.println("Atividade 3");
		for (int i = 1; i <= 1000; i++) {
			num2 = num2+i;
		}
		
		System.out.println("A soma é:"+num2);
		System.out.println("");

		//Atividade 4
		System.out.println("Atividade 4");
		for (int i = 1; i <= 100; i++) {
			if(i%3 <= 0) {
				System.out.println(i+" é multiplo de 3");
			}
		}
		System.out.println("");
		
		//Atividade 5
		System.out.println("Atividade 5");
		for (int i = 1; i <= 100; i++) {
			if(i%3 <= 0 && i%5 <= 0) {
				System.out.println(i+" é divisivel de 3 e 5");
			}else {System.out.println(i+" não é divisivel de 3 e  5");
				
			}
		}
		System.out.println("");
		
		
	}

}

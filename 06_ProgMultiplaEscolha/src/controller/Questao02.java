package controller;

import util.Teclado;

public class Questao02 {
	
	/*
	 * Desenvolver um programa que pergunte o sexo da pessoa e dê como
	 * resposta a seguinte orientação de acordo com o sexo informado:
	 * “Banheiro masculino à direita” ou “Banheiro feminino à esquerda”.
	 */

	public static void main(String[] args) {
		
		String sexo;
		
		sexo = Teclado.lerTexto("Informe o sexo:");
		sexo = sexo.toLowerCase();		
		
		switch (sexo) {
		
		case "masculino":
			System.out.println("Banheiro masculino à direita");
			break;
		case "feminino":
			System.out.println("Banheiro feminino à esquerda");
			break;
		default:
			System.out.println("Opção não identificada");
			break;	
		}

	}

}

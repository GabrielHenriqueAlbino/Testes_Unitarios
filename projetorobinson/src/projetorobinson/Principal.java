package projetorobinson;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Calcular calc = new Calcular();
		System.out.print("Digite o Valor do Capital:");
		calc.Capital = teclado.nextInt();
		
		System.out.print("Digite o Valor do Juro:");
		calc.Juros = teclado.nextInt();
		
		System.out.print("Digite os Meses:");
		calc.Meses = teclado.nextInt();
		
		calc.CalcularJuroComposto();
		
		System.out.print("Resultado:" + calc.Resultado);
		
		
		
		
		
		
	}

}
